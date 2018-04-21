#
#   Remapping of Data
#

#setwd("C:/Users/A/Dropbox/DBS_Project/Code/AranCode/DBS_Data_Analysis/DataCapture/Config1")


# Read data

df <- read.csv("data_export280114.csv")
#df$x <- df$x+20
#df$y <- df$y+20
#df$z <- df$z+20

#  Create ideal grid
#Set resolution
xmin = -20
xmax = 20
ymin = -20
ymax = 20
zmin = -20
zmax = 20

dimens<-c(xmax-xmin,ymax-ymin,zmax-zmin)
ideal_grid<-array(0,dimens)

# Tolerance of area use sd() to approx
tol_loc <- 1

checkAndAv<-function(indM){
  #Assign mean of location
  median(df$Potential[which((df$x<=indM["x"]+tol_loc&df$x>=indM["x"]-tol_loc)&
                              (df$y<=indM["y"]+tol_loc&df$y>=indM["y"]-tol_loc)&
                              (df$z<=indM["z"]+tol_loc&df$z>=indM["z"]-tol_loc))])
}

mtx <- data.frame(expand.grid(x=xmin:xmax,y=ymin:ymax,z=zmin:zmax))
K <- apply(mtx, 1, checkAndAv)

#Push into new setup
ideal_grid[as.matrix(mtx+20)]<-K
