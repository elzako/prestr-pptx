package com.aspose.slides.Collections.Generic;

class RBTree$1 implements IGenericEnumerable<RBTree$Node> {
   // $VF: synthetic field
   final RBTree n5;

   @Override
   public IGenericEnumerator<RBTree$Node> iterator() {
      return new RBTree$NodeEnumerator(this.n5.a6());
   }

   // BUILD-ONLY: mandatory constructorless normalization removes this entire member.
   private RBTree$1(com.aspose.slides.Collections.Generic.RBTree recoveryArg0) {
      super();
      this.n5 = recoveryArg0;
   }
}
