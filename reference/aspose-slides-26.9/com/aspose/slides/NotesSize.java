package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.geom.Dimension2D;

public class NotesSize implements INotesSize {
   long n5 = -1L;
   long l6 = -1L;
   private Presentation k5;

   public NotesSize() {
   }

   NotesSize(Presentation presentation) {
      this.k5 = presentation;
   }

   @Override
   public final Dimension2D getSize() {
      return com.aspose.slides.internal.o9b.f2.n5(this.n5());
   }

   com.aspose.slides.internal.o9b.f2 n5() {
      return this.n5 < 0L
         ? new com.aspose.slides.internal.o9b.f2(Float.NaN, Float.NaN)
         : new com.aspose.slides.internal.o9b.f2((float)(this.n5 / 12700.0), (float)(this.l6 / 12700.0));
   }

   @Override
   public final void setSize(Dimension2D value) {
      this.n5(com.aspose.slides.internal.o9b.f2.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.f2 var1) {
      if (!(var1.l6() < 1.0F) && !(var1.k5() < 1.0F)) {
         if (!com.aspose.slides.ms.System.n1.k5(var1.l6()) && !com.aspose.slides.ms.System.n1.k5(var1.k5())) {
            if (this.n5 > 1L && this.l6 > 1L) {
               this.k5(var1.a6());
            }

            this.n5 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var1.l6() * 12700.0), 14);
            this.l6 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var1.k5() * 12700.0), 14);
         } else {
            this.n5 = this.l6 = -1L;
         }
      } else {
         throw new PptxEditException("Slide size dimensions should be positive.");
      }
   }

   final void l6(com.aspose.slides.internal.o9b.f2 var1) {
      this.n5 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var1.l6() * 12700.0), 14);
      this.l6 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var1.k5() * 12700.0), 14);
   }

   private void k5(com.aspose.slides.internal.o9b.f2 var1) {
      if (this.k5 != null && this.k5.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
         long var2 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var1.l6() * 12700.0), 14);
         long var4 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var1.k5() * 12700.0), 14);
         float var6 = (float)var2 / (float)this.n5;
         float var7 = (float)var4 / (float)this.l6;
         IGenericEnumerator var8 = this.k5.getMasterNotesSlideManager().getMasterNotesSlide().getShapes().iterator();

         try {
            while (var8.hasNext()) {
               IShape var9 = (IShape)var8.next();
               if (var9.getPlaceholder() != null && var9.getPlaceholder().getType() == 14) {
                  float var10 = var9.getWidth() / var9.getHeight();
                  var9.setY(var9.getY() * var7);
                  var9.setHeight(var9.getHeight() * var7);
                  var9.setX(var9.getX() * var6);
                  var9.setWidth(var9.getWidth() * var6);
                  float var11 = var9.getWidth();
                  var9.setWidth(var9.getHeight() * var10);
                  var9.setX(var9.getX() - (var9.getWidth() - var11) / 2.0F);
               } else {
                  var9.setX(var9.getX() * var6);
                  var9.setY(var9.getY() * var7);
                  var9.setWidth(var9.getWidth() * var6);
                  var9.setHeight(var9.getHeight() * var7);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
               var8.dispose();
            }
         }
      }
   }
}
