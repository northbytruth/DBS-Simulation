#
#	Create 3D representations of the model results
#

library(rgl)

#dependency on Data_Clean.R - for data variable

rgl.open() #creates window

rgl.bg(col="#cccccc") #sets background grey

#Add new variable
#find mag and then scale
scaleP <- sqrt(data_test2$Potential^2)*100
data_test2<-data.frame(data_test2,scaleP)
scaleP[scaleP>1]=100
scaleP[!scaleP>1]=scaleP[!scaleP>1]*100
scaleP<-log(scaleP)

#total view
attach(data_test2)

#colour according to value
pal <- colorRampPalette(c("red", "green"))
colors <- heat.colors(400)#pal(100)


rgl.points( X, Y, Z, color = colors[round(scaleP)])

#spheres3d( X, Y, Z,color = "red") #crashes computer


#focused
#attach(data_focus)

#colour according to value
#pal <- colorRampPalette(c("red", "green"))
#colors <- heat.colors(100)#pal(100)


#rgl.points( X, Y, Z, color = colors[round(Potential)])

#scaleP <- sqrt(data$Potential^2)
#data<-data.frame(data,scaleP)
#scaleP[scaleP>1]=100
#scaleP[!scaleP>1]=scaleP[!scaleP>1]*100
#scaleP<-log(scaleP)

#total view
#attach(data)

#colour according to value
#pal <- colorRampPalette(c("red", "green"))
#colors <- heat.colors(100)#pal(100)

#rgl.points( X, Y, Z, color = colors[round(scaleP)])
