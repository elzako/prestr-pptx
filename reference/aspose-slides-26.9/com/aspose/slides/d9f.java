package com.aspose.slides;

final class d9f extends g4a {
   public d9f(OleObjectFrame var1) {
      super(var1);
   }

   public final OleObjectFrame n5() {
      return (OleObjectFrame)super.a6();
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (!this.a6().getHidden()) {
         ShapeFrame var4 = this.n3();
         float var5 = var4.getX();
         float var6 = var4.getY();
         float var7 = var4.getWidth();
         float var8 = var4.getHeight();
         if (!com.aspose.slides.ms.System.n1.k5(var5)
            && !com.aspose.slides.ms.System.n1.k5(var6)
            && !com.aspose.slides.ms.System.n1.k5(var7)
            && !com.aspose.slides.ms.System.n1.k5(var8)) {
            boolean var9 = false;
            if (!this.a6().a5()) {
               var9 = var1.n5("Figure", ((ShapeFrame)this.a6().getFrame()).n5().y4(), this.a6().getAlternativeText());
            }

            com.aspose.slides.internal.w0.c8 var10 = new com.aspose.slides.internal.w0.c8();
            var1.k5(var10);
            j5m var11 = new j5m(var4.cloneT(), new com.aspose.slides.internal.w0.c8(), null, this.h0(), var2);
            com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1(var5, var6, var7, var8);
            var1.n5(var12.y4(), null, a1v.n5(var11, (FillFormat)this.a6().getFillFormat()));
            PictureFillFormat var13 = this.n5().l6;
            if (var13.getPicture().getImage() != null) {
               w2 var14 = com.aspose.slides.internal.v6g.k5.n5(var1, w2.class);
               if (var14 != null
                  && var14.k5() != null
                  && var14.k5().getIncludeOleData()
                  && var14.k5().getCompliance() != 4
                  && var14.k5().getCompliance() != 3
                  && var14.k5().getCompliance() != 10) {
                  var14.n5((com.aspose.slides.IOleObjectFrame)(this.n5()));
               }

               if (!((PPImage)var13.getPicture().getImage()).s7() && !this.n5().isObjectIcon()) {
                  var1.n5(var12.y4(), null, new q3d(var11, var13));
               } else {
                  if (this.n5().isObjectIcon()) {
                     this.n5().k5 = this.n5().z8();
                     var13 = this.n5().k5;
                  }

                  if (var14 != null && !var14.e2()) {
                     var14.n5(var13.getPicture().getImage(), var12.y4(), null);
                  } else {
                     q3d var15 = new q3d(var11, var13);
                     byte[] var16 = var15.c4().u3() ? var15.c4().a6() : new byte[0];
                     if (!com.aspose.slides.internal.n8e.k7.h0(var16) && var14 != null) {
                        var11 = new j5m(var4.cloneT(), var1, null, this.h0(), 5, var2);
                        var1.n5(var12.y4(), null, new q3d(var11, var13));
                     } else {
                        var1.n5(var12.y4(), null, var15);
                     }
                  }

                  if (var14 != null) {
                     var14.n5((IOleObjectFrame)null);
                  }
               }
            }

            ILineFormat var17 = this.a6().getLineFormat();
            if (!var17.isFormatNotDefined()) {
               float var18 = com.aspose.slides.ms.System.d2.k5(var17.getWidth()) ? 0.0F : (float)var17.getWidth();
               var1.n5(
                  new com.aspose.slides.internal.o9b.y1(var5 - var18 / 2.0F, var6 - var18 / 2.0F, var7 + var18, var8 + var18),
                  new l6v(var11, (LineFormat)var17),
                  null
               );
            }

            var1.z3();
            if (var9) {
               var1.u9();
            }
         }
      }
   }
}
