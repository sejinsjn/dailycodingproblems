main: main.c solution.h lib/libmy.a
	gcc main.c -o main -L lib -lmy

lib/libmy.a: lib solution.o
	ar r lib/libmy.a solution.o
	rm solution.o

lib:
	mkdir lib

stringcat.o: solution.c
	gcc solution.c -c

clean:
	rm main -r lib