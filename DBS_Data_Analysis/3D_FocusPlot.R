#
#   3D Focus Plot
#

# Setup RGL
library(rgl)
rgl.open()

#Filter data to focus size
data_test2<-read.csv("data_test2.csv")

#data_test2<-read.csv("data_export280114.csv")
names(data_test2)<-c("X","Y","Z","Potential")


#Data prep/filter
#scaleP <- sqrt(data$Potential^2)*100
#data_test2<-data.frame(data,scaleP)
#rm(scaleP)

#data_focus<-data_test2[(data_test2$Potential<1),]
#data_focus$Potential<-sqrt((data_focus$Potential^2))*5

#Plotting
attach(data_test2)

colors <- heat.colors(20)

rgl.points( X, Y, Z, color = colors[sqrt(data$Potential^2)])
