
#	Import libraries
import os
from os import environ
from os.path import join
import numpy as np
from surfer import Brain, io


#	Environmental Variable setup
subjects_dir = "/home/aran/Code/Mri_Data"
os.environ['SUBJECTS_DIR'] = subjects_dir

#	Setup the patient
subject_id = 'fsaverage'
hemi = 'lh'
#surface = 'inflated'
surface = 'smoothwm'

#Create brain and start viewer
brain = Brain(subject_id, hemi, surface)


#	Add Marker
#
#brain.add_label("BA1", color="#A6BDDB")
#Brodmann Area Maps
#brain.add_label("V2", color="#F0F8FF", borders=True, scalar_thresh=.5)
#x y z

#seed_coords = (0, 0, 0)
#brain.add_foci(seed_coords, map_surface="white",color="red")

#seed_coords = (0, 0, 0)
#brain.add_foci(seed_coords, map_surface="white",color="gold")

#
#	Add field overlay
#


#	Build up addressing

#Label locations - Brodmann Maps
#lh.aparc.label  lh.BA3b.label  lh.BA4p.label        lh.Medial_wall.label
#lh.BA1.label    lh.BA44.label  lh.BA6.label         lh.MT.label
#lh.BA2.label    lh.BA45.label  lh.cortex.label      lh.V1.label
#lh.BA3a.label   lh.BA4a.label  lh.entorhinal.label  lh.V2.label

#Medial_wall for field

label_file = join(subjects_dir, "fsaverage", "label", "lh.Medial_wall.label")

prob_field = np.zeros_like(brain._geo.x)

ids, probs = io.read_label(label_file, read_scalars=True)


#	Setup field shading
#	Set constant for the field applied
#prob_field[ids] = 10

#Import field and then setup to replace the
#constant setting, ids is area index

potfile = open("field_tst3")

#inp_field = potfile.read()
inp_field = potfile.read().split('\n')
potfile.close()


#prob_field[ids] = probs

#write the potential calue
for x in range(0, ids.size):
	prob_field[ids[x]] = float(inp_field[x])


"""   #Write field out
myfile= open('test2.txt','w')
prob_field.tofile(myfile,sep=",",format="%s")
myfile.close()
"""
"""	  #Read field in
myfile= open('outt2.csv','r')
prob_field=np.fromfile(myfile, dtype=float, count=-1, sep=',')
myfile.close()
"""

#overlay stuff

#overlay_file = "/home/aran/Code/Mri_Data/fsaverage/mri/lh.ribbon.mgz"

#brain.add_overlay(overlay_file)#overlay_file)

#brain.overlays["sig"].remove()

#brain.add_overlay(overlay_file, min=5, max=20, sign="pos")


#brain.add_label("BA45", color="#F0F8FF", borders=True, scalar_thresh=.5)

#brain.add_label("Medial_wall", color="#F0F8FF", borders=True, scalar_thresh=.5)
#brain.add_label("Medial_wall", color="#F0F8FF", alpha=.3, scalar_thresh=.5)


#	Adding to object

brain.add_data(prob_field, thresh=1e-5, colormap="Reds") 



#	Creates and saves the result

brain.save_montage('Field_Example.png', colorbar='auto')