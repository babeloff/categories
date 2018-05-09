# A repository for standard categories

This is an effort to revisit the notion of design patterns informed by category theory.
I suspect that what we thought of as design-patterns, aspects, and other concepts are better reprsented as categories.
As these concepts are specified as categories a categorical language will develop.
Once a significant quantity of these categories have been defined they will be used to bootstrap a categorical transaction log and database.
That database will provide the opportunity to revisit the tinkerpop3 api and reframe it in the context of categories rather than graphs.

## Standard Categories

From mathematics we have many standard categories.

## Model Categories

Domain specific categories.

https://docs.google.com/presentation/d/1My25uX_R41AoV0TUtndxN2gmWqZEfCZ6sOqDzdUj7mI/edit?usp=sharing

## Approach

I am advocating an organic approach, starting with extant ad-hoc languages and begin pruning.
The kernel languages are based on category theory with little domain specific baggage.
The domain specific categories are diagrammed from the kernel language.
It would be a scale-free-network where the kernel-language categories would be the hubs.

Let me illustrate the process with an example.

Consider the category of discrete categories as an index category with a diagram to the category of numerals.
Some members of this category are 0 1  and 2 .
These three members could be naively defined as...

(defcat u-0 {:obs [0]} )
(defcat u-1 {:obs [0 1]} )
(defcat u-2 {:obs [0 1 2]} )

The requirement that these form categories implies the existence of identity morphisms.
This simple language already tells us some things about the kernel language.
* it must express objects
* some things may be implied, the objects imply identity morphisms, or identity morphisms could have been specified and objects implied.
* listing all objects of a category is impractical

Let's take the third point.
The remaining discrete categories can be described by a generating morphism.
Assuming that the infinite category of discrete categories exists and that each discrete category has a name.
Any new infinite category, of the same cardinality, can be indexed (diagrammed) from the discrete category.

We learn two new things about the kernel language regarding infinite categories.
* the language must provide for infinite categories
   * one way, by induction
   * another way, by diagrams from index categories

In this way we can proceed to develop the language.
The goal should be to ameliorate the language by careful selection of fundamental concepts.
Addressing the problem of "O(n^2) different relationships":
* I believe it is possible to design a language so that any statements made in that language may be automatically migrated.
*
