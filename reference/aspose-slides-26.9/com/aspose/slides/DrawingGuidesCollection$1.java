package com.aspose.slides;

class DrawingGuidesCollection$1 extends com.aspose.slides.ms.System.g7<IDrawingGuide> {
   // $VF: synthetic field
   final IDrawingGuide n5;
   // $VF: synthetic field
   final DrawingGuidesCollection l6;

   DrawingGuidesCollection$1(DrawingGuidesCollection var1, IDrawingGuide var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   public boolean n5(IDrawingGuide var1) {
      return var1.getOrientation() == this.n5.getOrientation() && var1.getPosition() == this.n5.getPosition();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean invoke(IDrawingGuide bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
