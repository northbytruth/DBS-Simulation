
library(ggplot2)

#   2D graphics plots
data <- all_df#read.csv("data_test2.csv")
names(data)<-c("x","y","z","Potential")

data_orig <- data


#   Filter data
#data <- data[(data$x>0&data$x<1)|(data$x<0&data$x>(-1)),]

#adjust to pos
#data$x<-data$x+20
#data$y<-data$y+20
#data$z<-data$z+20


data$xcut<-cut(data$x,seq(-20:20))
data$ycut<-cut(data$y,seq(-20:20))
data$zcut<-cut(data$z,seq(-20:20))

data$Pscale<-10^(10*data$Potential)

#col <- heat.colors(20)


#pts.grid <- interp(as.data.frame(pts)$coords.x1, as.data.frame(pts)$coords.x2, as.data.frame(pts)$GWLEVEL_TI)
#pts.grid2 <- expand.grid(x=pts.grid$x, y=pts.grid$y)
#pts.grid2$z <- as.vector(pts.grid$z)

#library(akima)

#plot_grid <- interp(data$x,data$y,data$Potential,duplicate="mean")

#Need to implement an interpolation function for variables


#   2D slice

jpeg("potential_plot.jpg")

p<-ggplot(data,aes(x=data$z,y=data$y))
p<-p+geom_point()
p<-p+geom_point(aes(colour=abs(data$Potential)))

p

dev.off()



#   Contour plot


gv<-ggplot(data,aes(x=z,y=y,z=Potential))
gv<-gv+stat_density2d(binwidth = 2)


#contour - need sorted datasets
#data_plane<-data[data$Potential>0.5,]

#v<-ggplot(data_plane,aes(x=data_plane$x,y=data_plane$y,z=data_plane$Potential))
#v<-v+stat_contour()


#qplot(data[data$Y==0,]$Z,data[data$Y==0,]$X,color=data[data$Y==0,]$Potential)


#filled.contour(data[data$Y==0,]$Z,data[data$Y==0,]$X,data[data$Y==0,]$Potential)

#Density plots for XYZ distros
#plot(density(X))
