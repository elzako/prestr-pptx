package com.aspose.slides;

public abstract class DomObject<TParent> implements r0g {
   final TParent u9;

   DomObject(TParent parent) {
      this.u9 = parent;
   }

   @Override
   public r0g getParent_Immediate() {
      return (r0g)this.u9;
   }
}
