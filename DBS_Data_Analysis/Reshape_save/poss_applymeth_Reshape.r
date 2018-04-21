
function(indM){
    #Assign mean of location
    median(df$Potential[which((df$x<=indM["x"]+tol_loc&df$x>=indM["x"]-tol_loc)&
                                  (df$y<=indM["y"]+tol_loc&df$y>=indM["y"]-tol_loc)&
                                  (df$z<=indM["z"]+tol_loc&df$z>=indM["z"]-tol_loc))])
}

mtx <- data.frame(expand.grid(x=1:5,y=1:5,z=1:5))
K <- apply(mtx, 1, checkAndAv)

ideal_grid[as.matrix(mtx)]<-K

image(ideal_grid[1:5,1:5,1])
