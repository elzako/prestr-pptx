package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

final class j5f extends l0 implements l8k {
   private boolean l6 = true;
   private final IAutoShape k5;
   private final int u3;
   private final int a6;
   private final List<com.aspose.slides.internal.o9b.c8> u9 = new List<>();

   public static boolean n5(ColorEffect var0) {
      if (var0.getProperties().size() == 1) {
         String var1 = var0.getProperties().get_Item(0).getValue();
         return "style.color".equals(var1);
      } else {
         return false;
      }
   }

   public j5f(int var1, int var2, IAutoShape var3, ColorEffect var4) {
      super(var4, var3.getSlide());
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("startParIndex");
      } else if (var2 < 0) {
         throw new ArgumentOutOfRangeException("endParIndex");
      } else {
         this.k5 = var3;
         this.u3 = var1;
         this.a6 = var2;
         String var5 = var4.getProperties().get_Item(0).getValue();
         if (!"style.color".equals(var5)) {
            throw new NotSupportedException();
         }
      }
   }

   @Override
   public final void n5(float var1) {
      IParagraphCollection var2 = this.k5.getTextFrame().getParagraphs();
      if (this.l6) {
         this.l6 = false;
         this.u9.clear();

         for (int var3 = this.u3; var3 <= this.a6; var3++) {
            IParagraph var4 = var2.get_Item(var3);
            IGenericEnumerator var5 = var4.getPortions().iterator();

            try {
               while (var5.hasNext()) {
                  IPortion var6 = (IPortion)var5.next();
                  com.aspose.slides.internal.o9b.c8 var7 = ((ColorFormat)var6.getPortionFormat().getFillFormat().getSolidFillColor()).u3().o8();
                  this.u9.addItem(var7.o8());
                  var6.getPortionFormat().getFillFormat().setFillType((byte)1);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      }

      int var16 = 0;

      for (int var17 = this.u3; var17 <= this.a6; var17++) {
         IParagraph var18 = var2.get_Item(var17);
         IGenericEnumerator var19 = var18.getPortions().iterator();

         try {
            while (var19.hasNext()) {
               IPortion var20 = (IPortion)var19.next();
               if (var16 < this.u9.size()) {
                  com.aspose.slides.internal.o9b.c8 var8 = n5(this.u9.get_Item(var16).o8(), this.n5.o8(), var1).o8();
                  ((ColorFormat)var20.getPortionFormat().getFillFormat().getSolidFillColor()).n5(var8.o8());
                  var16++;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
               var19.dispose();
            }
         }
      }
   }

   @Override
   public final void n5() {
      this.n5(1.0F);
   }
}
