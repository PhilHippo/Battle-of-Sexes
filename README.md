# Battle_of_Sexes
Programming 2 exam project

A population is a set of individuals; individuals are grouped into
types. We define state of a type T the ratio between the number of individuals
of type T over the total number of individuals. The global state associates each
type with its state. We assume a notion of closeness is given: two population
are close if the difference between the values of their state is small enough to be
negligible.
Populations evolve according to (possibly non-deterministic) rules which
determine how the individuals of each type thrive (grow in their number) or
langiush (decrease) depending on the global state. An evolution trace is an infi-
nite sequence < p0, p1, · · · > of pupulations, where p0 is called initial and each
pn+1 is obtained from pn by applying the evolution rules. We say that a trace
reaches stability if it includes a population pn such that for each m > n the state
of pm is close to that of pn.
