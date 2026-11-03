package com.aspose.slides;

public class GraphicalObject extends Shape implements IGraphicalObject {
   static GraphicalObject n5(r0g var0) {
      GraphicalObject var1 = new GraphicalObject(var0);
      var1.n5((com.aspose.slides.g4a)null);
      return var1;
   }

   GraphicalObject(r0g parentImmediate) {
      this(parentImmediate, new x6p(), new z9x());
   }

   GraphicalObject(r0g parentImmediate, x6p pptxUnsupportedProps) {
      this(parentImmediate, pptxUnsupportedProps, new z9x());
   }

   GraphicalObject(r0g parentImmediate, x6p pptxUnsupportedProps, z9x pptUnsupportedProps) {
      super(parentImmediate, pptxUnsupportedProps, pptUnsupportedProps, new GraphicalObjectLock());
      this.n5(new o4f());
   }

   @Override
   boolean n3() {
      return true;
   }

   x6p t4() {
      return (x6p)super.h0();
   }

   z9x m1() {
      return (z9x)super.k7();
   }

   @Override
   public final IGraphicalObjectLock getGraphicalObjectLock() {
      return (IGraphicalObjectLock)super.getShapeLock();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   z9x k7() {
      return this.m1();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   x6p h0() {
      return this.t4();
   }

}
