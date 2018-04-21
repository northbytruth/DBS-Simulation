#
#  Grid Smoothing
#
#To be used after Slice_Creator to take
#slice and convert to a grid
#either big 5/5
#or small 2/2

#sel_df is slice name used

# Big Grid Case

#Create grid to fit
#grid is a square
#need to map below to 0-100
#x axis seq(-5,5,0.1)
#y axis seq(-5,5,0.1)

size_min = 0
size_max = 1001

dimens<-c(size_max,size_max)
big_grid <- array(0,dimens)

attach(sel_df)

sel_df$grX<-round(((Z-min(Z))*95)+1)
sel_df$grY<-round(((Y-min(Y))*95)+1)

attach(sel_df)

big_grid[matrix(c(grY,grX),length(grX),2)] = Potential

image(big_grid)