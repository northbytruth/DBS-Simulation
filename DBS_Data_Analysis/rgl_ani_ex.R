open3d()
plot3d( cube3d(col="green") )
M <- par3d("userMatrix")
if (!rgl.useNULL())
  play3d( par3dinterp( userMatrix=list(M,
                                       rotate3d(M, pi/2, 1, 0, 0),
                                       rotate3d(M, pi/2, 0, 1, 0) ) ), 
          duration=4 )
## Not run: 
movie3d( spin3d(), duration=5 )
