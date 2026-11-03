package com.aspose.slides;

public class FilterEffect extends Behavior implements IFilterEffect {
   int a6;
   int u9;
   int h0 = -1;

   public FilterEffect() {
      super(new u4x());
   }

   final u4x l6() {
      return (u4x)super.n5();
   }

   @Override
   public final int getReveal() {
      return this.h0;
   }

   @Override
   public final void setReveal(int value) {
      this.h0 = value;
   }

   @Override
   public final int getType() {
      return this.a6;
   }

   @Override
   public final void setType(int value) {
      this.a6 = value;
   }

   @Override
   public final int getSubtype() {
      return this.u9;
   }

   @Override
   public final void setSubtype(int value) {
      this.u9 = value;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   u4x n5() {
      return this.l6();
   }

}
