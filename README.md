Elijah congenial-robot
=======================


Outstanding
------------

- `[WARNING] JAR will be empty - no content was marked for inclusion!`
- b6131a94a052ca941de9f92c17ef6456d8687385

----

The elijah-lang compiler.

https://github.com/elijah-team/congenial-robot

```shell
E=`mktemp -d`
git clone https://github.com/elijah-team/congenial-robot -b 2024-congenial-update $E
(cd $E && nix-shell -p maven jdk17_headless --pure --command "mvn test")
```

This project is licensed under LGPL.

You will need JVM 17 and Maven.

Oh yeah, and patience.


GOALS
------

- Less noise
- More verification
  - on the road to correctness
- Build confidence to reduce procrastination
- Automate everything except actual work


LINEAGE
--------

`Septagon` - Starting over, again

`Rosetta` - Encapsulating state/environment. Pull model.

`Congenial` - Testablility/verification


TODO
-----

- Convert to ant (Might do ./bld)
- Finish vision (what the hell is this?)
- Stop fuddling (work on tests)
- Stop fiddling (testing mergify now)
