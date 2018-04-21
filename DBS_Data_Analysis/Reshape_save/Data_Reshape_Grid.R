#
#   Remapping of Data
#

# Read data
#name data



# Create ideal grid

xlen = 40
ylen = 40
zlen = 40

dimens<-c(xlen,ylen,zlen)
ideal_grid<-array(0,dimens)

# Tolerance of area use sd() to approx
tol_loc <- 1
df <- read.csv("data_test2.csv")

checkAndAv<-function(indM){
  #Assign mean of location
  median(df$Potential[which((df$x<=indM["x"]+tol_loc&df$x>=indM["x"]-tol_loc)&
                              (df$y<=indM["y"]+tol_loc&df$y>=indM["y"]-tol_loc)&
                              (df$z<=indM["z"]+tol_loc&df$z>=indM["z"]-tol_loc))])
}

mtx <- data.frame(expand.grid(x=1:5,y=1:5,z=1:5))
K <- apply(mtx, 1, checkAndAv)

ideal_grid[as.matrix(mtx)]<-K

image(ideal_grid[1:5,1:5,1])




# #which() to check indices
# df<-data
# 
# checkAndAv<-function(i,j,k){
#   #Assign mean of location
#   mean(df$Potential[which((df$x<=i+tol_loc&df$x>=i-tol_loc)&
#                               (df$y<=j+tol_loc&df$y>=j-tol_loc)&
#                               (df$z<=k+tol_loc&df$z>=k-tol_loc))])
# }
# 
# 
# 
# mapply(checkAndAv,ideal_grid,row(ideal_grid),col(ideal_grid),)

#mat <- matrix(c(1, 2, 3, 4), 2, 2)
#matrix(mapply(function(x, i, j) x + i + j, mat, row(mat), col(mat)), nrow = nrow(mat))


# 
# #Loop x
# for(i in 1:xlen){
#   #Loop y
#   for(j in 1:ylen){  
#     #Loop z
#     for(k in 1:zlen){  
#       #Choose data points close
#       #to matrix point and take mean
#       sel_loc<-which((data$x<=i+tol_loc&data$x>=i-tol_loc)&
#                     (data$y<=j+tol_loc&data$y>=j-tol_loc)&
#                     (data$z<=k+tol_loc&data$z>=k-tol_loc))
#                     
#       #Assign mean of location
#       ideal_grid[i,j,k]<-mean(data$Potential[sel_loc])
#       
#       
#     }
#   } 
# }
