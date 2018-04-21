#
#   Create slice from data to plot
#

# Load data
all_df<-read.csv("Config2_Data.csv",header=FALSE,comment.char="%")
names(all_df)<-c("X","Y","Z","Potential")
# Set criteria

#Plane choice
tol_loc <-0.1
x_ran<-c(0,0)
y_ran<-c(-5,5)
z_ran<-c(-5,5)

#Fuzzy area selection
sel_loc<- which((all_df$X<=x_ran[2]+tol_loc&all_df$X>=x_ran[1]-tol_loc)&
                              (all_df$Y<=y_ran[2]+tol_loc&all_df$Y>=y_ran[1]-tol_loc)&
                              (all_df$Z<=z_ran[2]+tol_loc&all_df$Z>=z_ran[1]-tol_loc))

#Create slice frame and flatten one coord 3D->2D
sel_df<-all_df[sel_loc,]
attach(sel_df)
sel_df<-data.frame(Y,X,Potential)

#Color and plot to show

#set back to common orange neutral  #FFB52D

rbPal <- colorRampPalette(c('blue','green','red'),bias=2)

all_df$col<-rbPal(100)[as.numeric(cut(all_df$Potential,breaks = 100))]

sel_df$col<-rbPal(100)[as.numeric(cut(sel_df$Potential,breaks = 100))]
#plot(sel_df$Y[Potential>0.3],sel_df$Z[Potential>0.3],col=sel_df$col[Potential>0.3])
#X11() #linux
#windows() #windows



#Report Graphs - rem to x11()

#Histograms of slice
#jpeg("before_slicez.jpg")
#hist(all_df$Z)
#dev.off()

library(ggplot2)

#Histogram of potentials
#hist(all_df$Potential)
#Focus between

#Plot of field distribution
#plot(Y,Z,col=sel_df$col,pch=19)
#Focus between  Z: 4 & -2   Y: 1.8 & -1.8
sel= (Y<1.8)&(Y>(-1.8))&(Z<4)&(Z>(-2))

#jpeg("uglycoloursplot.jpg")
#plot(Y[sel],Z[sel],col=sel_df$col[sel],pch=19)
#dev.off()

#plot(all_df$Y[abs(all_df$Potential)>0.5],all_df$Z[abs(all_df$Potential)>0.5])

#top down

#jpeg("planet2.jpg")
#plot(all_df$Y[abs(all_df$Potential)>0.2],all_df$X[abs(all_df$Potential)>0.2],col=all_df$col[abs(all_df$Potential)>0.2],pch=19)
#dev.off()


#xz side on

#jpeg("comcpy.jpg")
#plot(all_df$Y[abs(all_df$Potential)>0.2],all_df$X[abs(all_df$Potential)>0.2],col=all_df$col[abs(all_df$Potential)>0.2],pch=19)
#dev.off()

# Axis vs Potential

jpeg("YPotential.jpg")
p<-ggplot(all_df,aes(x=Y,y=Potential))
p<-p+geom_point()
p
dev.off()

jpeg("XPotential.jpg")
p<-ggplot(all_df,aes(x=X,y=Potential))
p<-p+geom_point()
p
dev.off()
