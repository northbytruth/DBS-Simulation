#
#   Create slice from data to plot
#

# Load data
all_df<-read.csv("Data_Config1.csv",header=FALSE,comment.char="%")
names(all_df)<-c("X","Y","Z","Potential")
# Set criteria

#Plane choice
tol_loc <-0.1
x_ran<-c(1,1)
y_ran<-c(-5,5)
z_ran<-c(-5,5)

#Fuzzy area selection
sel_loc<- which((all_df$X<=x_ran[2]+tol_loc&all_df$X>=x_ran[1]-tol_loc)&
                              (all_df$Y<=y_ran[2]+tol_loc&all_df$Y>=y_ran[1]-tol_loc)&
                              (all_df$Z<=z_ran[2]+tol_loc&all_df$Z>=z_ran[1]-tol_loc))

#Create slice frame and flatten one coord 3D->2D
sel_df<-all_df[sel_loc,]
attach(sel_df)
sel_df<-data.frame(Y,Z,Potential)

#

rbPal <- colorRampPalette(c('red','orange','white'),bias=2)
sel_df$col<-rbPal(100)[as.numeric(cut(abs(sel_df$Potential),breaks = 100))]


#Report Graphs

hist(all_df$Potential)



#Example graphs

plot(all_df$Y[abs(all_df$Potential)>0.5],all_df$Z[abs(all_df$Potential)>0.5])

#plot(sel_df$Y[Potential>0.3],sel_df$Z[Potential>0.3],col=sel_df$col[Potential>0.3])
#plot(Y,Z,col=sel_df$col)

#plot(sel_df$Y[abs(Potential)>0.02],sel_df$Z[abs(Potential)>0.02],col=sel_df$col[abs(Potential)>0.02])

#smoothScatter(Y,Z,nbin=1000,colramp=colorRampPalette(c("red","orange","white")))

#cond=abs(Potential)>0.5
#par(bg="")
#smoothScatter(Y[cond],Z[cond],nbin=1000,colramp=colorRampPalette(c("red","orange","white")))