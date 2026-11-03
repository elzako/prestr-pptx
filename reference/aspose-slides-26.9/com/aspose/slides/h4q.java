package com.aspose.slides;

class h4q {
   private com.aspose.slides.internal.o9b.y1 n5 = new com.aspose.slides.internal.o9b.y1();
   private ISlide l6;

   public final com.aspose.slides.internal.o9b.y1 n5() {
      return this.n5.y4();
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      this.n5 = var1.y4();
   }

   public final ISlide l6() {
      return this.l6;
   }

   public final void n5(ISlide var1) {
      this.l6 = var1;
   }

   public final void n5(e3 var1, s5u var2, y4x var3, boolean var4, boolean var5, boolean var6) {
      if (this.l6() != null) {
         i3g var7 = ((Slide)this.l6()).t4();
         if (var5) {
            TextParam$FontArgs var8 = new TextParam$FontArgs();
            var8.Name = this.l6().getPresentation().getMasterTheme().getFontScheme().getMinor().getLatinFont().getFontName();
            var8.Height = 10.0F;
            TextParam var9 = new TextParam((Presentation)this.l6().getPresentation(), 72.0F, var8.Clone());
            var1.n5(
               com.aspose.slides.ms.System.a3.l6(this.l6().getSlideNumber()),
               new com.aspose.slides.internal.o9b.y1(
                  new com.aspose.slides.internal.o9b.w1(this.n5().x8(), this.n5().l6() + 15.0F), new com.aspose.slides.internal.o9b.f2()
               ),
               var9
            );
         }

         ShapeFrame var15 = new ShapeFrame(this.n5().x8(), this.n5().n3(), this.n5().s7(), this.n5().k5(), (byte)0, (byte)0, 0.0F);
         if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class)) {
            y4x var16 = new y4x();
            var16.c8 = var4;
            InterruptionToken var10 = (InterruptionToken)((Presentation)this.l6().getPresentation()).a6().getInterruptionToken();
            s5u var11 = new s5u(var7.l6(), var2.t4(), var16);
            var7.n5(var1, var15, var11, var16, var10);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
            s5u var17 = new s5u(var7.l6(), var2.t4(), var3);
            var7.n5(var1, var15, var17, var3, (InterruptionToken)((Presentation)this.l6().getPresentation()).a6().getInterruptionToken());
         } else {
            com.aspose.slides.internal.o9b.l6 var18 = var7.l6(
               new com.aspose.slides.internal.o9b.p8(
                  com.aspose.slides.internal.v6g.k5.u3(var15.getWidth() * 2.775, 14), com.aspose.slides.internal.v6g.k5.u3(var15.getHeight() * 2.775, 14)
               )
            );

            try {
               com.aspose.slides.internal.o9b.y1 var19 = new com.aspose.slides.internal.o9b.y1(var15.getX(), var15.getY(), var15.getWidth(), var15.getHeight());
               if (var4) {
                  var1.n5(var19.y4(), new l6v(com.aspose.slides.internal.o9b.c8.m3().o8(), 0.2F), null);
               }

               var1.n5(var18, var19.x8(), var19.n3(), var19.s7(), var19.k5());
            } finally {
               if (var18 != null) {
                  var18.dispose();
               }
            }
         }

         if (var6) {
            this.n5(var1, this.n5().y4());
         }
      }
   }

   final void n5(ISlide var1, boolean var2, boolean var3, boolean var4) {
      com.aspose.slides.internal.o9b.l6 var5 = ((Slide)this.l6()).k5(1.3333334F, 1.3333334F);

      byte[] var9;
      try {
         if (var4) {
            com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(
               new com.aspose.slides.internal.o9b.w1(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().a6()
            );
            r1c var7 = new r1c(var5, ((SlideSize)var1.getPresentation().getSlideSize()).n5().l6(), ((SlideSize)var1.getPresentation().getSlideSize()).n5().k5());

            try {
               this.n5(var7, var6.y4());
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         }

         com.aspose.slides.internal.z0k.e2 var24 = new com.aspose.slides.internal.z0k.e2();

         try {
            var5.n5(var24, com.aspose.slides.internal.j9e.x8.s7());
            var9 = var24.toArray();
         } finally {
            if (var24 != null) {
               var24.dispose();
            }
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      PPImage var25 = new PPImage(var1.getPresentation(), var9);
      IPictureFrame var26 = var1.getShapes().addPictureFrame(5, this.n5().x8(), this.n5().n3(), this.n5().s7(), this.n5().k5(), var25);
      if (var2) {
         var26.getLineFormat().getFillFormat().setFillType((byte)1);
         ((ColorFormat)var26.getLineFormat().getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         var26.getLineFormat().setWidth(0.75);
      }

      if (var3) {
         IAutoShape var8 = var1.getShapes().addAutoShape(5, this.n5().x8(), this.n5().l6() + 5.0F, 100.0F, 10.0F);
         var8.getLineFormat().getFillFormat().setFillType((byte)0);
         var8.getFillFormat().setFillType((byte)0);
         var8.getTextFrame().getTextFrameFormat().setMarginLeft(0.0);
         var8.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(0);
         var8.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
         ((ColorFormat)var8.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor())
            .n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         var8.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0F);
         var8.getTextFrame().setText(com.aspose.slides.ms.System.a3.l6(this.l6().getSlideNumber()));
      }
   }

   private void n5(e3 var1, com.aspose.slides.internal.o9b.y1 var2) {
      ShapeFrame var3 = ((Slide)this.l6()).y4();
      com.aspose.slides.internal.w0.c8 var4 = new com.aspose.slides.internal.w0.c8(
         var2.s7() / var3.getWidth(), 0.0F, 0.0F, var2.k5() / var3.getHeight(), var2.x8(), var2.n3()
      );
      var1.k5(var4);

      for (IComment var8 : this.l6().getSlideComments(null)) {
         String var9 = var8.getAuthor().getInitials();
         if ("n/a".equals(var9)) {
            var9 = "";
         }

         var9 = com.aspose.slides.ms.System.d1.n5(var9, (((Comment)var8).u3().n5() & 4294967295L) - 1L);
         l6v var10 = new l6v(com.aspose.slides.internal.o9b.c8.j3().o8(), 0.1F);
         a1v var11 = new a1v(this.n5(var8).o8());
         TextParam$FontArgs var12 = new TextParam$FontArgs();
         var12.Name = this.l6().getPresentation().getMasterTheme().getFontScheme().getMinor().getLatinFont().getFontName();
         var12.Height = 18.0F;
         TextParam var13 = new TextParam((Presentation)this.l6().getPresentation(), 72.0F, var12.Clone());
         com.aspose.slides.internal.o9b.n3 var14 = new com.aspose.slides.internal.o9b.n3(var12.Name, 13.5F);
         com.aspose.slides.internal.o9b.e5 var15 = new com.aspose.slides.internal.o9b.e5(com.aspose.slides.internal.o9b.e5.t2());
         var15.k5(var15.k5() | 2048);
         com.aspose.slides.internal.o9b.f2 var16 = var1.a0().n5(var9, var14, com.aspose.slides.internal.o9b.w1.n5.u3(), var15).a6();
         com.aspose.slides.internal.o9b.y1 var17 = new com.aspose.slides.internal.o9b.y1(
            ((Comment)var8).l6().l6(), ((Comment)var8).l6().k5(), var16.l6(), var16.k5()
         );
         com.aspose.slides.internal.o9b.y1 var18 = com.aspose.slides.internal.o9b.y1.n5(
               new com.aspose.slides.internal.o9b.y1(((Comment)var8).l6().l6(), ((Comment)var8).l6().k5() - var14.c8(), var16.l6(), var14.c8()), 5.0F, 5.0F
            )
            .y4();
         var1.n5(var18.y4(), var10, var11);
         var1.n5(var9, var17.y4(), var13);
      }

      var1.z3();
   }

   final com.aspose.slides.internal.o9b.c8 n5(IComment var1) {
      switch ((int)((((CommentAuthor)var1.getAuthor()).u3() & 4294967295L) % 9L & 4294967295L)) {
         case 0:
            return com.aspose.slides.internal.o9b.c8.p7();
         case 1:
            return com.aspose.slides.internal.o9b.c8.b5();
         case 2:
            return com.aspose.slides.internal.o9b.c8.u5();
         case 3:
            return com.aspose.slides.internal.o9b.c8.o7();
         case 4:
            return com.aspose.slides.internal.o9b.c8.q1();
         case 5:
            return com.aspose.slides.internal.o9b.c8.r1();
         case 6:
            return com.aspose.slides.internal.o9b.c8.b5();
         case 7:
            return com.aspose.slides.internal.o9b.c8.w5();
         default:
            return com.aspose.slides.internal.o9b.c8.c2();
      }
   }
}
