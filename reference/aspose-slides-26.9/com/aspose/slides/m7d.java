package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

final class m7d extends t0 {
   public m7d(NotesSlide var1) {
      super(var1);
   }

   public final NotesSlide l6() {
      return (NotesSlide)super.n5;
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.p8 var1, y4x var2) {
      com.aspose.slides.internal.t4r.n5 var3 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class
      );
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 139273);
      var4.n5(96.0F, 96.0F);
      com.aspose.slides.ms.System.o0 var5 = com.aspose.slides.ms.System.o0.l6().k5();

      try {
         r6e.n5(var5.k5());
         com.aspose.slides.internal.o9b.f2 var6 = ((NotesSize)this.n5().getNotesSize()).n5().a6();
         r1c var7 = new r1c(var4, var6.l6(), var6.k5());

         try {
            var7.n5(
               new com.aspose.slides.internal.o9b.y1(-1.0F, -1.0F, var6.l6() + 2.0F, var6.k5() + 2.0F),
               null,
               new a1v(com.aspose.slides.internal.o9b.c8.w4().o8())
            );
            s5u var8 = new s5u(this.l6(), var3, var2);
            this.n5(var7, var8, var2);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         r6e.n5(var5.k5(), var4);
         return var4;
      } catch (RuntimeException var37) {
         r6e.l6(var5.k5());
         var4.dispose();
         throw var37;
      } finally {
         Dictionary$Enumerator var13 = var3.l6().iterator();

         try {
            while (var13.hasNext()) {
               KeyValuePair var14 = (KeyValuePair)var13.next();
               if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var14.getKey())) {
                  ((com.aspose.slides.internal.k9.u9)var14.getValue()).k5().dispose();
                  var3.l6(var14.getKey());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }
   }

   public final void n5(e3 var1, s5u var2, y4x var3) {
      ShapeFrame var4 = new ShapeFrame(
         0.0F, 0.0F, ((NotesSize)this.n5().getNotesSize()).n5().l6(), ((NotesSize)this.n5().getNotesSize()).n5().k5(), (byte)0, (byte)0, 0.0F
      );
      a1v var5 = this.n5((Background)this.l6().getBackground(), var4, var1, var2);
      if (var5 == null) {
         var5 = new a1v(com.aspose.slides.internal.o9b.c8.w4().o8());
      }

      a1v var6 = var5;
      var1.n5(var4.n5().y4(), null, var6);
      if (this.n5() != null) {
         if (this.n5().getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            this.n5().getMasterNotesSlideManager().setDefaultMasterNotesSlide();
            ((i6f)this.n5().getMasterNotesSlideManager()).l6();
         }

         if (this.l6().getShowMasterShapes()) {
            ((BaseSlide)this.n5().getMasterNotesSlideManager().getMasterNotesSlide())
               .k5
               .e5()
               .n5(var1, var2, (InterruptionToken)this.n5().a6().getInterruptionToken());
         }
      }

      FillFormat var7 = null;
      byte var8 = -1;
      if (this.l6().u9 != null) {
         IGenericEnumerator var9 = this.l6().getShapes().iterator();

         try {
            while (var9.hasNext()) {
               Shape var10 = (Shape)var9.next();
               AutoShape var11 = com.aspose.slides.internal.v6g.k5.n5(var10, AutoShape.class);
               if (var11 != null
                  && var11.getPlaceholder() != null
                  && var11.getPlaceholder().getType() == 14
                  && var11.getFrame().getWidth() > 0.0F
                  && var11.getFrame().getHeight() > 0.0F) {
                  var7 = (FillFormat)var11.getFillFormat();
                  if (var7 != null) {
                     var8 = var7.getFillType();
                     var7.setFillType((byte)0);
                  }

                  i3g var12 = this.l6().u9.t4();
                  IShapeFrame var13 = var11.getFrame();
                  if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class)) {
                     y4x var14 = new y4x();
                     var14.e2.setHideInk(var2.c8().getHideInk());
                     var14.e2.setInterpretMaskOpAsOpacity(var2.c8().getInterpretMaskOpAsOpacity());
                     InterruptionToken var15 = (InterruptionToken)this.n5().a6().getInterruptionToken();
                     s5u var16 = new s5u(var12.l6(), var2.t4(), var14);
                     var12.n5(var1, var13, var16, var14, var15);
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
                     s5u var43 = new s5u(var12.l6(), var2.t4(), var3);
                     var12.n5(var1, var13, var43, var3, (InterruptionToken)this.n5().a6().getInterruptionToken());
                  } else {
                     s5u var44 = new s5u(var12.l6(), var2.t4(), var3);
                     com.aspose.slides.internal.o9b.l6 var45 = var12.n5(
                        new com.aspose.slides.internal.o9b.p8(
                           com.aspose.slides.internal.v6g.k5.u3(var13.getWidth() * 2.775, 14),
                           com.aspose.slides.internal.v6g.k5.u3(var13.getHeight() * 2.775, 14)
                        ),
                        var44
                     );

                     try {
                        com.aspose.slides.internal.o9b.y1 var46 = new com.aspose.slides.internal.o9b.y1(
                           var13.getX(), var13.getY(), var13.getWidth(), var13.getHeight()
                        );
                        com.aspose.slides.internal.o9b.l6 var17 = new com.aspose.slides.internal.o9b.l6(
                           com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var46.s7()), 14),
                           com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var46.k5()), 14)
                        );

                        try {
                           var17.n5();
                           com.aspose.slides.internal.o9b.z1 var18 = com.aspose.slides.internal.o9b.z1.n5(var17);

                           try {
                              var18.n5(
                                 var45,
                                 new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var13.getWidth(), var13.getHeight()),
                                 new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var45.e2(), var45.h0()),
                                 2
                              );
                           } finally {
                              if (var18 != null) {
                                 var18.dispose();
                              }
                           }

                           var1.n5(var45, var46.x8(), var46.n3(), var46.s7(), var46.k5());
                        } finally {
                           if (var17 != null) {
                              var17.dispose();
                           }
                        }
                     } finally {
                        if (var45 != null) {
                           var45.dispose();
                        }
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }
      }

      this.l6().k5.e5().n5(var1, var2, this.n5() == null ? InterruptionToken.getNone() : (InterruptionToken)this.n5().a6().getInterruptionToken());
      if (var7 != null) {
         var7.setFillType(var8);
      }

      this.n5(var1);
   }

   public final com.aspose.slides.internal.e1.t2 n5(boolean var1, s5u var2, y4x var3) {
      com.aspose.slides.internal.o9b.f2 var4 = ((NotesSize)this.n5().getNotesSize()).n5().a6();
      w2 var5 = new w2(
         com.aspose.slides.internal.v6g.k5.u3(var4.l6(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13),
         72.0F,
         72.0F,
         var1,
         var3,
         this.n5().t9(),
         null
      );
      this.n5(var5, var2, var3);
      return var5.y4();
   }
}
