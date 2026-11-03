package com.aspose.slides;

class x5n$1 extends com.aspose.slides.internal.f3.u3<PortionFormat, com.aspose.slides.internal.o9b.u3> {
   // $VF: synthetic field
   final MathPortion n5;
   // $VF: synthetic field
   final com.aspose.slides.internal.o9b.i1 l6;
   // $VF: synthetic field
   final MathParagraph k5;
   // $VF: synthetic field
   final x5n u3;

   x5n$1(x5n var1, MathPortion var2, com.aspose.slides.internal.o9b.i1 var3, MathParagraph var4) {
      this.u3 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
   }

   public com.aspose.slides.internal.o9b.u3 n5(PortionFormat var1) {
      if (var1 != null) {
         if (var1.getFillFormat().getFillType() == -1) {
            if (this.n5.getPortionFormat().getFillFormat().getFillType() == 1) {
               com.aspose.slides.internal.o9b.c8 var8 = ((ColorFormat)this.n5.getPortionFormat().getFillFormat().getSolidFillColor()).u3().o8();
               return new com.aspose.slides.internal.o9b.i1(var8.o8());
            }

            if (this.n5.getPortionFormat().getFillFormat().getFillType() == -1) {
               return this.l6;
            }
         }

         AutoShape var2 = new AutoShape(this.k5);
         var2.setShapeType(5);
         var2.addTextFrame(com.aspose.slides.ms.System.d1.a6("Text", com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.p8.k5())));
         var2.l6().k5(this.u3.n5);
         var2.l6().getTextFrameFormat().setWrapText((byte)0);
         TextFrame var3 = (TextFrame)var2.getTextFrame();
         Paragraph var4 = (Paragraph)var3.getParagraphs().get_Item(0);
         IParagraphFormat var5 = var4.getParagraphFormat();
         if (var5.getBullet().getType() == -1) {
            var5.getBullet().setType((byte)0);
         }

         ((PortionFormat)var5.getDefaultPortionFormat()).n5(var1);
         e2n var6 = e2n.n5(var4, 0).get_Item(0);
         com.aspose.slides.internal.o9b.c8 var7 = ((f6a)var6.u3().get_Item(0).n5.getFillFormat()).h0().o8();
         return new com.aspose.slides.internal.o9b.i1(var7.o8());
      } else {
         return this.l6;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.o9b.u3 invoke(PortionFormat bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
