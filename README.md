**CSCI 3415 – Principles of Programming Languages**

Programming Assignment 2 – Java

Due Oct. 9, 2017 

-----------------
# The Marvel Universe

> 
Marvel Comics, originally called Timely Comics Inc., has been publishing comic books for several decades. "The Golden Age of Comics" name that was given due to the popularity of the books during the first years, was later followed by a period of decline of interest in superhero stories due to World War ref. In 1961, Marvel relaunched its superhero comic books publishing line. This new era started what has been known as the Marvel Age of Comics. Characters created during this period such as Spider-Man, the Hulk, the Fantastic Four, and the X-Men, together with those created during the Golden Age such as Captain America, are known worldwide and have become cultural icons during thelast decades. Later, Marvel's characters popularity has been revitalized even more due
to the release of several recent movies which recreate the comic books using
spectacular modern special effects. Nowadays, it is possible to access the content of the comic books via a digital platform created by Marvel, where it is possible to subscribe monthly or yearly to get access to the comics. More information about the Marvel Universe can be found here. The Marvel Comics character collaboration graph was originally constructed by Cesc Rosselló, Ricardo Alberich, and Joe Miro from the University of the Balearic Islands. They compare the characteristics of this universe to real-world collaboration networks, such
as the Hollywood network, or the one created by scientists who work together in
producing research papers. Their original sources can be found here. With this dataset, the authors published the paper titled: "Marvel Universe looks almost like a real social network".
>

-----------------


# Part II – Get the Marvel Universe Data
I have posted the zip file containing the three comma separated value (CSV) files that define the social graph for the Marvel universe on the course’s Canvas web site. These three files are:

 - nodes.csv – Contains two columns, node and type. Each row defines a
   node in the social network. Node is the name of the node and type is
   either hero or comic. 
 - edges.csv – Contains two columns, hero and
   comic. Each row defines an edge from a hero node to a comic node in
   the social network. 
 - hero-network.csv – Contains two columns, hero1
   and hero2. Each row defines an instance of two heroes appearing in a
   single comic.

-----------------

# Specifics
Write a Java program to read the Marvel universe social network from the csv files nodes.csv, edges.csv, and hero-network.csv. Compute and print the following statistics for the social network:

 1. Number of heroes
 2. Number of comics
 3. Mean books per character
 4. Mean characters per book
 5. Mean partners per hero
