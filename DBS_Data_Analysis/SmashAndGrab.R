#

#all_df<-read.csv("Data2014_0324_17_57.csv",header=FALSE,comment.char="%")
#names(all_df)<-c("X","Y","Z","Potential")

#Take subset / Filter
filt_1<-which(all_df$X>-0.2&all_df$X<0.2)
fil_df<-all_df[filt_1,]

#
pal <- colorRampPalette(c("red", "orange"))
colors <- pal(5)
colors <- heat.colors(100)

#rgl preview
attach(fil_df)
rgl.points(X,Y,Z,color = colors[round(Potential*100)])

