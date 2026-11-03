package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;

class f2z {
   private final Presentation n5;
   private float l6;
   private float k5;
   private ITextFrame u3;
   private IFontData a6;
   private List<ISlide> u9;
   private final List<ISlide> h0 = new List<>();
   private float c8 = 10.0F;
   private float t2 = 25.0F;
   private float s7 = 6.0F;
   private NotesCommentsLayoutingOptions x8;
   private List<Integer> n3;
   private Dictionary<ISlide, Integer> y4 = new Dictionary<>();
   private String e2 = com.aspose.slides.ms.System.d1.n5;
   private final Object t9 = new Object();

   public final Presentation n5() {
      return this.n5;
   }

   final boolean l6() {
      Object var1 = null;
      String[] var2 = new String[]{(String)var1};
      String[] var3 = null;
      String[][] var4 = new String[][]{var3};
      byte[] var5 = null;
      byte[][] var6 = new byte[][]{var5};
      int[] var7 = Presentation.n5((s4e)this.n5.t4(), var6);
      var5 = var6[0];
      var4[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var7, i7t.l6) && var5 != null && var5.length > 0) {
         var4[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var5), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var8 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var8 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var10) {
            var8 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var10);
         }
      }

      var3 = var4[0];
      var2[0] = com.aspose.slides.ms.System.d1.n5(" ", var3);
      return (
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var7, i7t.k5)
         && !Arrays.equals(var8, com.aspose.slides.internal.n8e.z7.l6)
         && !Arrays.equals(var7, i7t.l6);
   }

   private boolean k5() {
      return this.x8.getNotesPosition() != 0;
   }

   private boolean u3() {
      return this.x8.getCommentsPosition() != 0;
   }

   private boolean a6() {
      return this.x8.getCommentsPosition() == 2;
   }

   private boolean u9() {
      return this.x8.getCommentsPosition() == 1;
   }

   private boolean h0() {
      return this.x8.getNotesPosition() == 2;
   }

   private f2z(Presentation var1, NotesCommentsLayoutingOptions var2) {
      int[] var3 = new int[var1.getSlides().size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var4 + 1;
      }

      this.n3 = new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5(var3)));
      if (var2 == null) {
         var2 = new NotesCommentsLayoutingOptions();
      }

      this.x8 = var2;
      if (!this.k5() && !this.u3()) {
         this.n5 = var1;
      } else {
         if (this.x8.k5()) {
            this.n5 = var1;
         } else {
            com.aspose.slides.internal.z0k.e2 var13 = new com.aspose.slides.internal.z0k.e2();

            try {
               synchronized (this.t9) {
                  var1.n5(var13, 3);
                  var13.seek(0L, 0);
                  LoadOptions var6 = this.n5(var1.a6(), var1.getProtectionManager().isEncrypted());
                  this.n5 = new Presentation(var13, var6);
                  this.n5.getFontsManager().setFontSubstRuleList(var1.getFontsManager().getFontSubstRuleList());
               }
            } finally {
               if (var13 != null) {
                  var13.dispose();
               }
            }
         }

         this.u9 = new List<>(com.aspose.slides.ms.System.u3.n5(this.n5.getSlides().toArray()));
         this.a6 = this.n5.getMasterTheme().getFontScheme().getMinor().getLatinFont();

         for (int var14 = 0; var14 < this.n5.getSlides().size(); var14++) {
            if (this.n3.containsItem(var14 + 1)) {
               this.y4.addItem(this.n5.getSlides().get_Item(var14), this.n5.getSlides().get_Item(var14).getSlideNumber());
            }
         }
      }
   }

   private f2z(Presentation var1, int[] var2, NotesCommentsLayoutingOptions var3) {
      if (var3 == null) {
         var3 = new NotesCommentsLayoutingOptions();
      }

      this.x8 = var3;
      this.n3 = new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5(var2)));
      if (!this.k5() && !this.u3()) {
         this.n5 = var1;
      } else {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            synchronized (this.t9) {
               var1.n5(var4, 3);
               var4.seek(0L, 0);
               LoadOptions var6 = this.n5(var1.a6(), var1.getProtectionManager().isEncrypted());
               this.n5 = new Presentation(var4, var6);
               this.n5.getFontsManager().setFontSubstRuleList(var1.getFontsManager().getFontSubstRuleList());
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         List var13 = new List();

         for (int var14 = 0; var14 < this.n5.getSlides().size(); var14++) {
            if (this.n3.containsItem(var14 + 1)) {
               var13.addItem(this.n5.getSlides().get_Item(var14));
               this.y4.addItem(this.n5.getSlides().get_Item(var14), this.n5.getSlides().get_Item(var14).getSlideNumber());
            }
         }

         for (int var15 = 0; var15 < this.n5.getSlides().size(); var15++) {
            if (!var13.containsItem(this.n5.getSlides().get_Item(var15))) {
               this.n5.getSlides().remove(this.n5.getSlides().get_Item(var15--));
            }
         }

         this.u9 = new List<>(com.aspose.slides.ms.System.u3.n5(this.n5.getSlides().toArray()));
         this.n3.clear();

         for (int var16 = 0; var16 < var2.length; var16++) {
            this.n3.addItem(var16 + 1);
         }

         this.a6 = this.n5.getMasterTheme().getFontScheme().getMinor().getLatinFont();
      }
   }

   private LoadOptions n5(LoadOptions var1, boolean var2) {
      LoadOptions var3 = new LoadOptions(3);
      var3.setDefaultAsianFont(var1.getDefaultAsianFont());
      var3.setDefaultRegularFont(var1.getDefaultRegularFont());
      var3.setDefaultSymbolFont(var1.getDefaultSymbolFont());
      var3.setDocumentLevelFontSources(var1.getDocumentLevelFontSources());
      var3.n5(var1.n5());
      var3.setResourceLoadingCallback(var1.getResourceLoadingCallback());
      if (var2) {
         var3.setPassword(var1.getPassword());
      }

      return var3;
   }

   private void c8() {
      if (this.k5() || this.u3()) {
         this.t2();
         if (this.a6()) {
            if (this.k5()) {
               ((NotesSize)this.n5.getNotesSize())
                  .l6(
                     new com.aspose.slides.internal.o9b.f2(
                        ((NotesSize)this.n5.getNotesSize()).n5().l6() + this.x8.getCommentsAreaWidth(), ((NotesSize)this.n5.getNotesSize()).n5().k5()
                     )
                  );
            } else {
               this.n5
                  .getSlideSize()
                  .setSize(((SlideSize)this.n5.getSlideSize()).n5().l6() + this.x8.getCommentsAreaWidth(), ((SlideSize)this.n5.getSlideSize()).n5().k5(), 0);
            }
         }

         if (this.n5.getMasterNotesSlideManager() != null && this.n5.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
            IGenericEnumerator var1 = this.n5.getMasterNotesSlideManager().getMasterNotesSlide().getShapes().iterator();

            try {
               while (var1.hasNext()) {
                  IShape var2 = (IShape)var1.next();
                  if (this.n5(var2, (byte)5)) {
                     this.e2 = var2.getName();
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
                  var1.dispose();
               }
            }
         }

         List var31 = new List();

         for (int var32 = 0; var32 < this.n5.getSlides().size(); var32++) {
            ISlide var3 = this.n5.getSlides().get_Item(var32);
            if (this.u3()) {
               this.l6(var3);
            }

            if (this.u9.containsItem(var3)) {
               if (this.k5()) {
                  if (var3.getNotesSlideManager().getNotesSlide() == null) {
                     var3.getNotesSlideManager().addNotesSlide();
                  }

                  IGenericEnumerator var4 = var3.getNotesSlideManager().getNotesSlide().getShapes().iterator();

                  try {
                     while (var4.hasNext()) {
                        IShape var5 = (IShape)var4.next();
                        if (var5.getPlaceholder() != null && var5.getPlaceholder().getType() == 1) {
                           IAutoShape var6 = com.aspose.slides.internal.v6g.k5.n5(var5, IAutoShape.class);
                           if (var6 != null) {
                              if (((ShapeFrame)var6.getFrame()).n5().u3()) {
                                 var6.setHeight(this.l6 - this.k5);
                                 var6.setWidth(((NotesSize)this.n5.getNotesSize()).n5().l6() - 40.0F);
                                 var6.setY(this.k5);
                                 var6.setX(20.0F);
                              }

                              this.u3 = var6.getTextFrame();
                              if (this.u3 != null) {
                                 this.n5(this.u3, 12.0F);
                                 if (this.l6() && this.u3.getParagraphs().getCount() > 0) {
                                    while (this.u3.getParagraphs().getCount() > 1) {
                                       this.u3.getParagraphs().removeAt(this.u3.getParagraphs().getCount() - 1);
                                    }

                                    if (this.u3.getParagraphs().get_Item(0).getPortions().getCount() > 0) {
                                       while (this.u3.getParagraphs().get_Item(0).getPortions().getCount() > 1) {
                                          this.u3
                                             .getParagraphs()
                                             .get_Item(0)
                                             .getPortions()
                                             .removeAt(this.u3.getParagraphs().get_Item(0).getPortions().getCount() - 1);
                                       }
                                    }
                                 }

                                 n5(this.u3);
                                 int[] var7 = new int[]{var32};
                                 this.n5(var3, var7);
                                 var32 = var7[0];
                                 var31.addItem(var3);
                                 break;
                              }
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                        var4.dispose();
                     }
                  }
               }

               if (this.u9()) {
                  int[] var36 = new int[]{var32};
                  this.n5(var3, var36, 0, true);
                  var32 = var36[0];
                  ((Slide)var3).l6(this.y4.get_Item(var3));
               }
            }
         }

         List$Enumerator var33 = var31.iterator();

         try {
            while (var33.hasNext()) {
               ISlide var34 = (ISlide)var33.next();
               this.n5.getSlides().remove(var34);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var33, IDisposable.class)) {
               var33.dispose();
            }
         }

         if (this.a6()) {
            IGenericEnumerator var35 = this.n5.getSlides().iterator();

            try {
               while (var35.hasNext()) {
                  ISlide var37 = (ISlide)var35.next();
                  this.n5(var37);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var35, IDisposable.class)) {
                  var35.dispose();
               }
            }
         }
      }
   }

   private void n5(ISlide var1, int[] var2, int var3, boolean var4) {
      IComment[] var5 = var1.getSlideComments(null);
      if (var5.length != 0) {
         int var6 = 1;
         com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2();
         com.aspose.slides.internal.o9b.f2[] var8 = new com.aspose.slides.internal.o9b.f2[]{var7};
         IBaseSlide var9 = this.n5(var1, var8, var2);
         var8[0].l6(var7);
         ITable var10 = this.n5(var9);
         float var11 = var7.k5() - 100.0F;
         int var12 = this.u9.indexOf(var1) + 1;
         var10.get_Item(0, 0)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .setText(com.aspose.slides.ms.System.d1.n5("Slide ", com.aspose.slides.ms.System.a3.l6(var12), var3 == 0 ? "" : " (continue)"));

         for (int var13 = var3; var13 < var5.length; var13++) {
            if (this.x8.getShowCommentsByNoAuthor() || !"n/a".equals(var5[var13].getAuthor().getInitials())) {
               String var14 = "";
               String var15 = "";
               var10.getRows().addClone(var10.getRows().get_Item(var6), false);
               if (var4) {
                  var10.get_Item(0, var6)
                     .getTextFrame()
                     .getParagraphs()
                     .get_Item(0)
                     .getPortions()
                     .get_Item(0)
                     .setText(
                        com.aspose.slides.ms.System.d1.n5(
                           var5[var13].getAuthor().getInitials(), com.aspose.slides.ms.System.l4.l6(((Comment)var5[var13]).u3().n5())
                        )
                     );
               }

               var10.get_Item(1, var6).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(var5[var13].getText());
               Portion var16 = this.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"\n", var5[var13].getAuthor().getName(), "; ", ((Comment)var5[var13]).n5()}));
               var10.get_Item(1, var6).getTextFrame().getParagraphs().get_Item(0).getPortions().add(var16);
               if (var10.getHeight() > var11) {
                  var15 = var16.getText();
                  var10.get_Item(1, var6).getTextFrame().getParagraphs().get_Item(0).getPortions().remove(var16);
                  var4 = false;
                  if (var10.getHeight() > var11) {
                     double var17 = var11 - ((Table)var10).getY() - var10.get_Item(1, var6).getOffsetY();
                     double var19 = var10.get_Item(1, var6).getHeight();
                     double var21 = var19 / var17;
                     if (!(var21 > 0.0)) {
                        var14 = var5[var13].getText();
                        var4 = true;
                        var10.getRows().removeAt(var6, false);
                     } else {
                        int var23 = com.aspose.slides.internal.v6g.k5.u3(var5[var13].getText().length() / var21, 14);
                        String var24 = com.aspose.slides.ms.System.d1.n5(var5[var13].getText(), var23);
                        int var25 = com.aspose.slides.ms.System.d1.u3(var24, " ");
                        var10.get_Item(1, var6)
                           .getTextFrame()
                           .getParagraphs()
                           .get_Item(0)
                           .getPortions()
                           .get_Item(0)
                           .setText(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.n5(var24, var25)));
                        var14 = com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var5[var13].getText(), var25));

                        while (var10.getHeight() < var11) {
                           var25 = com.aspose.slides.ms.System.d1.u3(var14, ' ');
                           if (var25 < 0) {
                              break;
                           }

                           var10.get_Item(1, var6)
                              .getTextFrame()
                              .getParagraphs()
                              .get_Item(0)
                              .getPortions()
                              .get_Item(0)
                              .setText(
                                 com.aspose.slides.ms.System.d1.n5(
                                    var10.get_Item(1, var6).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(),
                                    com.aspose.slides.ms.System.d1.l6(var14, 0, var25 + 1)
                                 )
                              );
                           var14 = com.aspose.slides.ms.System.d1.k5(var14, var25 + 1);
                        }

                        while (var10.getHeight() > var11) {
                           var25 = com.aspose.slides.ms.System.d1.u3(
                              var10.get_Item(1, var6).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), " "
                           );
                           if (var25 <= 0) {
                              break;
                           }

                           var14 = com.aspose.slides.ms.System.d1.n5(
                              var14,
                              0,
                              com.aspose.slides.ms.System.d1.n5(
                                 com.aspose.slides.ms.System.d1.k5(
                                    var10.get_Item(1, var6).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), var25
                                 ),
                                 " "
                              )
                           );
                           var10.get_Item(1, var6)
                              .getTextFrame()
                              .getParagraphs()
                              .get_Item(0)
                              .getPortions()
                              .get_Item(0)
                              .setText(
                                 com.aspose.slides.ms.System.d1.n5(
                                    var10.get_Item(1, var6).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), var25
                                 )
                              );
                        }
                     }
                  }
               }

               var14 = com.aspose.slides.ms.System.d1.l6(var14);
               if (!com.aspose.slides.ms.System.d1.n5(var15)) {
                  var5[var13].setText(var14);
                  this.n5(var1, var2, var13, var4);
                  break;
               }

               var4 = true;
               var6++;
            }
         }

         var10.get_Item(0, 0).getCellFormat().getBorderBottom().setWidth(1.0);
         var10.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte)1);
         ((ColorFormat)var10.get_Item(0, 0).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor())
            .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      }
   }

   private void n5(ISlide var1, int[] var2) {
      float var3 = 0.0F;
      int var4 = var1.getSlideNumber();
      if (this.y4.containsKey(var1)) {
         var4 = this.y4.get_Item(var1);
      }

      boolean var5 = true;
      ISlide var6 = null;
      IAutoShape var7 = null;
      IGenericEnumerator var8 = this.u3.getParagraphs().iterator();

      try {
         while (var8.hasNext()) {
            Paragraph var9 = (Paragraph)var8.next();
            if (var9.getEndParagraphPortionFormat() != null) {
               PortionFormat var10 = (PortionFormat)var9.getEndParagraphPortionFormat();
               Portion var11 = new Portion();
               var11.l6 = var10;
               var9.getPortions().add(var11);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }

      while (this.u3.getParagraphs().getCount() > 0) {
         if (this.h0() && !var5) {
            if (var7.getTextFrame() != null) {
               float var17 = var7.getHeight();

               while (
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var17 - var7.getHeight()), 13) == 0
                     && var7.getTextFrame().getParagraphs().get_Item(var7.getTextFrame().getParagraphs().getCount() - 1).getPortions().getCount() > 0
               ) {
                  IParagraph var20 = var7.getTextFrame().getParagraphs().get_Item(var7.getTextFrame().getParagraphs().getCount() - 1);
                  IPortion var24 = var20.getPortions().get_Item(var20.getPortions().getCount() - 1);
                  int var25 = com.aspose.slides.ms.System.d1.u3(var24.getText(), " ");
                  if (var25 >= 0) {
                     var24.setText(
                        com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.n5(var24.getText(), var25)), "..."})
                     );
                  } else {
                     var20.getPortions().remove(var24);
                     if (var20.getPortions().getCount() == 0) {
                        var7.getTextFrame().getParagraphs().remove(var20);
                     }
                  }
               }
            }

            float var18 = var7.getX() + 8.0F;
            float var21 = var7.getY() + var7.getHeight() + 4.0F;
            this.n5(var6.getNotesSlideManager().getNotesSlide(), var18, var21, false);
            return;
         }

         if (!var5 && com.aspose.slides.ms.System.d1.n5(this.u3.getText())) {
            return;
         }

         var6 = this.n5.getSlides().insertClone(++var2[0], var1);
         if (var5) {
            this.h0.addItem(var6);
         }

         var7 = null;

         for (int var16 = 0; var16 < var6.getNotesSlideManager().getNotesSlide().getShapes().size(); var16++) {
            IShape var19 = var6.getNotesSlideManager().getNotesSlide().getShapes().get_Item(var16);
            if (this.n5(var19, (byte)1)) {
               IShape var22 = var6.getNotesSlideManager().getNotesSlide().getShapes().get_Item(var16);
               var7 = com.aspose.slides.internal.v6g.k5.n5(var22, IAutoShape.class);
               var3 = var7.getWidth();
               if (!var5) {
                  var22.setY(this.k5);
               }
            } else if (this.n5(var19, (byte)14)) {
               if (!var5) {
                  var6.getNotesSlideManager().getNotesSlide().getShapes().removeAt(var16--);
               } else if (this.y4.containsKey(var1)) {
                  ((Slide)var6).l6(this.y4.get_Item(var1));
               }
            } else if (com.aspose.slides.ms.System.d1.a6(var19.getName(), this.e2) && !com.aspose.slides.ms.System.d1.n5(this.e2)
               || this.n5(var19, (byte)5) && this.y4.containsKey(var1)) {
               AutoShape var23 = (AutoShape)var6.getNotesSlideManager()
                  .getNotesSlide()
                  .getShapes()
                  .addAutoShape(5, var19.getX(), var19.getY(), var19.getWidth(), var19.getHeight());
               var23.getFillFormat().setFillType((byte)0);
               var23.getLineFormat().setWidth(0.0);
               var23.getLineFormat().getFillFormat().setFillType((byte)0);
               ITextFrame var12 = var23.addTextFrame(com.aspose.slides.ms.System.a3.l6(var4));
               var12.getTextFrameFormat().setAnchoringType((byte)2);
               var12.getParagraphs().get_Item(0).getParagraphFormat().setAlignment(2);
               if (((AutoShape)var19).getTextFrame().getParagraphs().get_Item(0).getPortions().getCount() == 0) {
                  ((AutoShape)var19).getTextFrame().getParagraphs().get_Item(0).getPortions().add(new Portion(""));
               }

               c9g var13 = ((PortionFormat)((AutoShape)var19).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat()).r4();
               var12.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(var13.h0());
               var12.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold((byte)(var13.getFontBold() ? 1 : 0));
               var12.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontItalic((byte)(var13.getFontItalic() ? 1 : 0));
               var12.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
               ((ColorFormat)var12.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor())
                  .n5(((f6a)var13.getFillFormat()).h0().o8());
               var12.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(var13.getLatinFont());
               var19.setHidden(true);
               var12.getParagraphs().get_Item(0).getPortions().get_Item(0).setText(com.aspose.slides.ms.System.a3.l6(var4));
            }
         }

         var5 = false;
         if (var7 != null && var7.getTextFrame() != null) {
            this.n5(var7, this.u3, this.l6, var3);
         }
      }
   }

   private void n5(ISlide var1) {
      boolean var2 = false;
      IBaseSlide var3 = this.k5() ? var1.getNotesSlideManager().getNotesSlide() : var1;
      if (var3 == null) {
         var3 = var1.getNotesSlideManager().addNotesSlide();
         var2 = true;
      }

      com.aspose.slides.internal.o9b.f2 var4 = (this.k5() ? ((NotesSize)this.n5.getNotesSize()).n5() : ((SlideSize)this.n5.getSlideSize()).n5()).a6();
      AutoShape var5 = (AutoShape)var3.getShapes().addAutoShape(5, var4.l6() - this.x8.getCommentsAreaWidth(), 0.0F, this.x8.getCommentsAreaWidth(), var4.k5());
      var5.getFillFormat().setFillType((byte)1);
      ((ColorFormat)var5.getFillFormat().getSolidFillColor()).n5(this.x8.n5().o8());
      IComment[] var6 = var1.getSlideComments(null);
      if (var6.length != 0) {
         if (this.h0.containsItem(var1) || var2 || !this.k5()) {
            ITable var7 = this.l6(var3);
            float var8 = var4.k5() - this.c8;
            float var9 = var8 / var6.length - 10.0F;
            if (var9 < 10.0F) {
               var9 = 10.0F;
            }

            int var10 = com.aspose.slides.internal.v6g.k5.u3(var9 / 10.0F * ((this.x8.getCommentsAreaWidth() - this.t2) / this.s7), 13);
            int var11 = 0;

            for (int var12 = 0; var12 < var6.length; var12++) {
               if (this.x8.getShowCommentsByNoAuthor() || !"n/a".equals(var6[var12].getAuthor().getInitials())) {
                  var7.getRows().addClone(var7.getRows().get_Item(var11), false);
                  var7.get_Item(0, var11)
                     .getTextFrame()
                     .getParagraphs()
                     .get_Item(0)
                     .getPortions()
                     .get_Item(0)
                     .setText(
                        com.aspose.slides.ms.System.d1.n5(new String[]{
                           var6[var12].getAuthor().getInitials(), com.aspose.slides.ms.System.l4.l6(((Comment)var6[var12]).u3().n5())
                        })
                     );
                  if (var6[var12].getText().length() > var10) {
                     var7.get_Item(1, var11)
                        .getTextFrame()
                        .getParagraphs()
                        .get_Item(0)
                        .getPortions()
                        .get_Item(0)
                        .setText(com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.d1.n5(var6[var12].getText(), var10), "..."}));
                  } else {
                     var7.get_Item(1, var11).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText(var6[var12].getText());
                  }

                  Portion var13 = this.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{"\n", var6[var12].getAuthor().getName(), "; ", ((Comment)var6[var12]).n5()}));
                  var7.get_Item(1, var11).getTextFrame().getParagraphs().get_Item(0).getPortions().add(var13);
                  if (var7.getHeight() > var8) {
                     var7.get_Item(1, var11).getTextFrame().getParagraphs().get_Item(0).getPortions().remove(var13);

                     while (var7.getHeight() > var8) {
                        int var14 = com.aspose.slides.ms.System.d1.k5(
                           var7.get_Item(1, var11).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), ' '
                        );
                        if (var14 < 0) {
                           var7.get_Item(1, var11).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText("");
                           var7.get_Item(0, var11).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).setText("...");
                           return;
                        }

                        var7.get_Item(1, var11)
                           .getTextFrame()
                           .getParagraphs()
                           .get_Item(0)
                           .getPortions()
                           .get_Item(0)
                           .setText(
                              com.aspose.slides.ms.System.d1.n5(new String[]{
                                 com.aspose.slides.ms.System.d1.l6(
                                    com.aspose.slides.ms.System.d1.n5(
                                       var7.get_Item(1, var11).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getText(), var14
                                    )
                                 ),
                                 "..."
                              })
                           );
                     }

                     float var16 = var7.getX() + var7.getWidth() - 40.0F;
                     float var15 = var7.getY() + var7.getHeight() - 10.0F;
                     this.n5(var3, var16, var15, true);
                     return;
                  }

                  var11++;
               }
            }
         }
      }
   }

   private boolean n5(IShape var1, byte var2) {
      return var1.getPlaceholder() != null && var1.getPlaceholder().getType() == var2;
   }

   private void n5(IAutoShape var1, ITextFrame var2, float var3, float var4) {
      if (com.aspose.slides.ms.System.d1.n5(var2.getText())) {
         var2.getParagraphs().remove(var2.getParagraphs().get_Item(0));
      } else {
         float var5 = var1.getHeight();
         float var6 = var1.getY();
         ITextFrame var7 = var1.getTextFrame();
         var7.getParagraphs().clear();
         var7.getTextFrameFormat().setAutofitType((byte)2);
         var1.setHeight(0.0F);

         while (var6 + var1.getHeight() < var3 && var2.getParagraphs().getCount() > 0) {
            IParagraph var8 = var2.getParagraphs().get_Item(0);
            var2.getParagraphs().remove(var8);
            var7.getParagraphs().add(var8);
            var1.setWidth(var4);
         }

         if (var6 + var1.getHeight() > var3) {
            if (var7.getParagraphs().getCount() == 0) {
               var2.getParagraphs().clear();
               return;
            }

            Paragraph var10 = new Paragraph((Paragraph)var7.getParagraphs().get_Item(0));
            var10.getPortions().clear();
            var2.getParagraphs().insert(0, var10);
            IParagraph var9 = var7.getParagraphs().get_Item(var7.getParagraphs().getCount() - 1);
            this.n5(var1, var9, var10, var3, var4);
         } else if (!var1.getLineFormat().isFormatNotDefined() && var6 + var5 < this.l6) {
            var7.getTextFrameFormat().setAutofitType((byte)-1);
            var1.setHeight(var5);
         }
      }
   }

   private void n5(IAutoShape var1, IParagraph var2, IParagraph var3, float var4, float var5) {
      while (var1.getY() + var1.getHeight() > var4 && var2.getPortions().getCount() > 0) {
         IPortion var6 = var2.getPortions().get_Item(var2.getPortions().getCount() - 1);
         var2.getPortions().remove(var6);
         var3.getPortions().insert(0, var6);
      }

      if (var1.getY() + var1.getHeight() < var4) {
         Portion var8 = new Portion((Portion)var3.getPortions().get_Item(0));
         var8.setText("");
         var2.getPortions().add(var8);
         this.n5(var1, var8, var3.getPortions().get_Item(0).getText(), 0, var3.getPortions().get_Item(0).getText().length(), var4, true);
         if (var8.getText().isEmpty()) {
            this.n5(var1, var8, var3.getPortions().get_Item(0).getText(), 0, var3.getPortions().get_Item(0).getText().length(), var4, false);
         }

         int var7 = var8.getText().length();
         if (var3.getPortions().get_Item(0).getText().charAt(var7) == ' ') {
            var3.getPortions().get_Item(0).setText(com.aspose.slides.ms.System.d1.k5(var3.getPortions().get_Item(0).getText(), var7 + 1));
         } else {
            var3.getPortions().get_Item(0).setText(com.aspose.slides.ms.System.d1.k5(var3.getPortions().get_Item(0).getText(), var7));
         }
      }
   }

   private void n5(IAutoShape var1, IPortion var2, String var3, int var4, int var5, float var6, boolean var7) {
      int var8 = var4 + (var5 - var4) / 2;
      int var9 = com.aspose.slides.ms.System.d1.n5(var3, " ", var8);
      if (var9 < 0) {
         if (var7) {
            return;
         }

         var9 = var8;
      }

      var2.setText(com.aspose.slides.ms.System.d1.l6(var3, 0, var9));
      if (var1.getY() + var1.getHeight() < var6) {
         if (var4 == var9) {
            return;
         }

         var4 = var9;
      } else {
         if (var5 == var9) {
            do {
               var9 = com.aspose.slides.ms.System.d1.u3(var2.getText(), " ");
               if (var9 < 0) {
                  return;
               }

               var2.setText(com.aspose.slides.ms.System.d1.l6(var2.getText(), 0, var9));
            } while (var1.getY() + var1.getHeight() > var6);
         }

         var5 = var9;
      }

      this.n5(var1, var2, var3, var4, var5, var6, var7);
   }

   private void n5(ITextFrame var1, float var2) {
      float var3 = var1.getTextFrameFormat().getTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat().getFontHeight();
      if (com.aspose.slides.ms.System.n1.k5(var3)) {
         var3 = var2;
      }

      IGenericEnumerator var4 = var1.getParagraphs().iterator();

      try {
         while (var4.hasNext()) {
            IParagraph var5 = (IParagraph)var4.next();
            IGenericEnumerator var6 = var5.getPortions().iterator();

            try {
               while (var6.hasNext()) {
                  IPortion var7 = (IPortion)var6.next();
                  if (com.aspose.slides.ms.System.n1.k5(var7.getPortionFormat().getFontHeight())) {
                     var7.getPortionFormat().setFontHeight(var3);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            IPortionFormat var16 = ((Paragraph)var5).getEndParagraphPortionFormat();
            if (var16 != null && com.aspose.slides.ms.System.n1.k5(var16.getFontHeight())) {
               var16.setFontHeight(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   static void n5(ITextFrame var0) {
      short var1 = 0;
      boolean var2 = false;
      short var3 = 0;
      short var4 = 0;
      IGenericEnumerator var5 = var0.getParagraphs().iterator();

      try {
         while (var5.hasNext()) {
            IParagraph var6 = (IParagraph)var5.next();
            if (var6.getParagraphFormat().getDepth() > var4) {
               var4 = var6.getParagraphFormat().getDepth();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      for (int var10 = 0; var10 <= var4; var10++) {
         for (int var7 = 0; var7 < var0.getParagraphs().getCount(); var7++) {
            if (var0.getParagraphs().get_Item(var7).getParagraphFormat().getDepth() <= var10) {
               if (var0.getParagraphs().get_Item(var7).getParagraphFormat().getDepth() < var10) {
                  var2 = false;
                  var1 = 0;
               } else if (var0.getParagraphs().get_Item(var7).getParagraphFormat().getBullet().getType() == 2) {
                  if (var10 == var0.getParagraphs().get_Item(var7).getParagraphFormat().getDepth()) {
                     if (var2) {
                        if (var0.getParagraphs().get_Item(var7).getParagraphFormat().getBullet().getNumberedBulletStartWith() == var3) {
                           var1++;
                        } else {
                           var1 = var0.getParagraphs().get_Item(var7).getParagraphFormat().getBullet().getNumberedBulletStartWith();
                           var3 = var1;
                        }

                        var0.getParagraphs().get_Item(var7).getParagraphFormat().getBullet().setNumberedBulletStartWith(var1);
                     } else {
                        var2 = true;
                        var1 = var0.getParagraphs().get_Item(var7).getParagraphFormat().getBullet().getNumberedBulletStartWith();
                        var3 = var1;
                     }
                  }
               } else {
                  var1 = 0;
                  var2 = false;
               }
            }
         }
      }
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, PdfOptions var2, InterruptionToken var3) {
      NotesCommentsLayoutingOptions var4 = com.aspose.slides.internal.v6g.k5.n5(var2.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var4 == null) {
         var4 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var4.setNotesPosition(0);
      }

      f2z var5 = new f2z(var0, var4);
      var5.c8();
      var5.n5(var1, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, PdfOptions var3, InterruptionToken var4) {
      NotesCommentsLayoutingOptions var5 = com.aspose.slides.internal.v6g.k5.n5(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var5 == null) {
         var5 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var5.setNotesPosition(0);
      }

      f2z var6 = new f2z(var0, var2, var5);
      var6.c8();
      var6.n5(var1, var3, var4);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, HtmlOptions var2, InterruptionToken var3) {
      NotesCommentsLayoutingOptions var4 = com.aspose.slides.internal.v6g.k5.n5(var2.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var4 == null) {
         var4 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var4.setNotesPosition(0);
      }

      f2z var5 = new f2z(var0, var4);
      var5.c8();
      r2k.n5(var5.n5(), var1, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, HtmlOptions var3, InterruptionToken var4) {
      NotesCommentsLayoutingOptions var5 = com.aspose.slides.internal.v6g.k5.n5(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var5 == null) {
         var5 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var5.setNotesPosition(0);
      }

      f2z var6 = new f2z(var0, var2, var5);
      var6.c8();
      r2k.n5(var6.n5(), var1, var3, var4);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, SwfOptions var2, InterruptionToken var3) {
      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         ((NotesCommentsLayoutingOptions)var2.getSlidesLayoutOptions()).setNotesPosition(0);
      }

      f2z var4 = new f2z(var0, (NotesCommentsLayoutingOptions)var2.getSlidesLayoutOptions());
      var4.c8();
      var4.n5(var1, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, SwfOptions var3, InterruptionToken var4) {
      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         ((NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions()).setNotesPosition(0);
      }

      f2z var5 = new f2z(var0, var2, (NotesCommentsLayoutingOptions)var3.getSlidesLayoutOptions());
      var5.c8();
      var5.n5(var1, var3, var4);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, TiffOptions var2, InterruptionToken var3) {
      NotesCommentsLayoutingOptions var4 = com.aspose.slides.internal.v6g.k5.n5(var2.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var4 == null) {
         var4 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var4.setNotesPosition(0);
      }

      f2z var5 = new f2z(var0, var4);
      var5.c8();
      r2k.n5(var5.n5(), var1, var2, var3);
   }

   static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, int[] var2, TiffOptions var3, InterruptionToken var4) {
      NotesCommentsLayoutingOptions var5 = com.aspose.slides.internal.v6g.k5.n5(var3.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class);
      if (var5 == null) {
         var5 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var5.setNotesPosition(0);
      }

      f2z var6 = new f2z(var0, var2, var5);
      var6.c8();
      r2k.n5(var6.n5(), var1, var3, var4);
   }

   static com.aspose.slides.internal.o9b.l6[] n5(Presentation var0, NotesCommentsLayoutingOptions var1, int[] var2) {
      return n5(var0, var1, var2, 1.0F, 1.0F);
   }

   static com.aspose.slides.internal.o9b.l6[] n5(Presentation var0, NotesCommentsLayoutingOptions var1, int[] var2, float var3, float var4) {
      if (var1 == null) {
         var1 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var1.setNotesPosition(0);
      }

      f2z var5 = new f2z(var0, var2, var1);
      var5.c8();
      y4x var6 = new y4x();
      return var5.n5(var6, var3, var4);
   }

   static com.aspose.slides.internal.o9b.l6[] n5(Presentation var0, NotesCommentsLayoutingOptions var1, int[] var2, com.aspose.slides.internal.o9b.p8 var3) {
      if (var1 == null) {
         var1 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var1.setNotesPosition(0);
      }

      f2z var4 = new f2z(var0, var2, var1);
      var4.c8();
      y4x var5 = new y4x();
      return var4.n5(var5, var3.u3());
   }

   static com.aspose.slides.internal.o9b.l6[] n5(
      Presentation var0, y4x var1, NotesCommentsLayoutingOptions var2, int[] var3, com.aspose.slides.internal.o9b.p8 var4
   ) {
      if (var2 == null) {
         var2 = new NotesCommentsLayoutingOptions();
      }

      if (var0.getMasterNotesSlideManager().getMasterNotesSlide() == null) {
         var2.setNotesPosition(0);
      }

      f2z var5 = new f2z(var0, var3, var2);
      var5.c8();
      return var5.n5(var1, var4.u3());
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, PdfOptions var2, InterruptionToken var3) {
      com.aspose.slides.internal.z0k.t4 var4 = var1.canSeek() ? var1 : new com.aspose.slides.internal.z0k.e2();
      new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.t4r.n5 var6 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class, 30
      );
      com.aspose.slides.internal.o9b.f2 var5;
      if (this.k5()) {
         var5 = new com.aspose.slides.internal.o9b.f2(
            (float)com.aspose.slides.internal.n2d.t2.l6(((NotesSize)this.n5.getNotesSize()).n5().l6(), 72.0),
            (float)com.aspose.slides.internal.n2d.t2.l6(((NotesSize)this.n5.getNotesSize()).n5().k5(), 72.0)
         );
      } else {
         var5 = new com.aspose.slides.internal.o9b.f2(
            (float)com.aspose.slides.internal.n2d.t2.l6(((SlideSize)this.n5.getSlideSize()).n5().l6(), 72.0),
            (float)com.aspose.slides.internal.n2d.t2.l6(((SlideSize)this.n5.getSlideSize()).n5().k5(), 72.0)
         );
      }

      com.aspose.slides.internal.z4.c4 var7 = new com.aspose.slides.internal.z4.c4(var4, var2.l6());
      y4x var8 = new y4x();
      var8.y4 = var2;
      var8.n5 = true;
      var8.u3 = var2.getWarningCallback();
      var8.a6 = var2.getJpegQuality();
      var8.u9 = var2.getSufficientResolution();
      var8.e2.setHideInk(var2.getInkOptions().getHideInk());
      var8.e2.setInterpretMaskOpAsOpacity(var2.getInkOptions().getInterpretMaskOpAsOpacity());
      c2m var9 = this.n5.j5();

      try {
         try {
            IGenericEnumerator var10 = this.n5.getSlides().iterator();

            try {
               while (var10.hasNext()) {
                  Slide var11 = (Slide)var10.next();
                  if (var11 != null && (!var11.getHidden() || var2.getShowHiddenSlides())) {
                     com.aspose.slides.internal.e1.w1 var12 = new com.aspose.slides.internal.e1.w1(var5.l6(), var5.k5());
                     if (this.k5()) {
                        INotesSlide var13 = var11.getNotesSlideManager().getNotesSlide();
                        if (var13 == null) {
                           var13 = var11.getNotesSlideManager().addNotesSlide();
                        }

                        s5u var14 = new s5u(var13, var6, var8);
                        com.aspose.slides.internal.e1.t2 var15 = ((NotesSlide)var13).t4().n5(var2.getSaveMetafilesAsPng(), var14, var8);
                        var12.n5(var15);
                     } else {
                        w2 var53 = var11.n5(var2.getSaveMetafilesAsPng(), var6, var8, var3);
                        var12.n5(var53.y4());
                     }

                     var11.getShapes().clear();
                     var7.l6(var12, new f2z$1(this, var3));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }

            String var51 = com.aspose.slides.ms.System.d1.n5(new String[]{"Aspose.Slides for Java", " ", "26.9"});
            com.aspose.slides.internal.b8.u9 var52 = var7.l6().k5();
            IDocumentProperties var54 = this.n5.getDocumentProperties();
            var52.a6(var51);
            var52.k5(var54.getAuthor());
            var52.s7(var54.getCategory());
            var52.l6(((DocumentProperties)var54).l6().m3());
            var52.h0(var54.getComments());
            var52.n5(var51);
            var52.u9(var54.getKeywords());
            var52.c8(var54.getLastSavedBy());
            var52.n5(((DocumentProperties)var54).u3().m3());
            var52.k5(((DocumentProperties)var54).k5().m3());
            var52.t2(com.aspose.slides.ms.System.a3.n5(var54.getRevisionNumber(), com.aspose.slides.internal.x7n.l6.k5()));
            var52.u3(var54.getSubject());
            var52.l6(var54.getTitle());
            var7.n5();
            var4.flush();
            if (var4 != var1) {
               ((com.aspose.slides.internal.z0k.e2)var4).writeTo(var1);
            }
         } finally {
            Dictionary$Enumerator var19 = var6.l6().iterator();

            try {
               while (var19.hasNext()) {
                  KeyValuePair var20 = (KeyValuePair)var19.next();
                  if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var20.getKey())) {
                     ((com.aspose.slides.internal.k9.u9)var20.getValue()).k5().dispose();
                     var6.l6(var20.getKey());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
                  var19.dispose();
               }
            }
         }
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, SwfOptions var2, InterruptionToken var3) {
      com.aspose.slides.internal.z0k.t4 var4 = var1.canSeek() ? var1 : new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.t4r.n5 var5 = new com.aspose.slides.internal.t4r.n5<>(
         com.aspose.slides.internal.k9.h0.class, com.aspose.slides.internal.k9.u9.class, 30
      );
      String var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"Aspose.Slides for Java", " ", "26.9"});
      com.aspose.slides.internal.b8.u9 var7 = new com.aspose.slides.internal.b8.u9();
      IDocumentProperties var8 = this.n5.getDocumentProperties();
      var7.a6(var6);
      var7.k5(var8.getAuthor());
      var7.s7(var8.getCategory());
      var7.l6(((DocumentProperties)var8).l6().m3());
      var7.h0(var8.getComments());
      var7.n5(var6);
      var7.u9(var8.getKeywords());
      var7.c8(var8.getLastSavedBy());
      var7.n5(((DocumentProperties)var8).u3().m3());
      var7.k5(((DocumentProperties)var8).k5().m3());
      var7.t2(com.aspose.slides.ms.System.a3.n5(var8.getRevisionNumber(), com.aspose.slides.internal.x7n.l6.k5()));
      var7.u3(var8.getSubject());
      var7.l6(var8.getTitle());
      com.aspose.slides.internal.p5k.j5 var9 = new com.aspose.slides.internal.p5k.j5(var4, var7, var2.n5());
      y4x var10 = new y4x();
      var10.n5 = true;
      var10.u3 = var2.getWarningCallback();
      var10.u9 = 96.0F;
      com.aspose.slides.internal.o9b.f2 var11 = (this.k5() ? ((NotesSize)this.n5.getNotesSize()).n5() : ((SlideSize)this.n5.getSlideSize()).n5()).a6();
      c2m var12 = this.n5.j5();

      try {
         try {
            IGenericEnumerator var13 = this.n5.getSlides().iterator();

            try {
               while (var13.hasNext()) {
                  Slide var14 = (Slide)var13.next();
                  if (var14 != null && (!var14.getHidden() || var2.getShowHiddenSlides())) {
                     com.aspose.slides.internal.e1.w1 var15 = new com.aspose.slides.internal.e1.w1(var11.l6(), var11.k5());
                     if (this.k5()) {
                        INotesSlide var16 = var14.getNotesSlideManager().getNotesSlide();
                        if (var16 == null) {
                           var16 = var14.getNotesSlideManager().addNotesSlide();
                        }

                        s5u var17 = new s5u(var16, var5, var10);
                        com.aspose.slides.internal.e1.t2 var18 = ((NotesSlide)var16).t4().n5(true, var17, var10);
                        var15.n5(var18);
                     } else {
                        w2 var54 = var14.n5(true, var5, var10, var3);
                        var15.n5(var54.y4());
                     }

                     var9.l6(var15, new f2z$2(this, var3));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
                  var13.dispose();
               }
            }

            var9.n5();
            var4.flush();
            if (var4 != var1) {
               ((com.aspose.slides.internal.z0k.e2)var4).writeTo(var1);
            }
         } finally {
            Dictionary$Enumerator var22 = var5.l6().iterator();

            try {
               while (var22.hasNext()) {
                  KeyValuePair var23 = (KeyValuePair)var22.next();
                  if (!this.n5().c4().n5((com.aspose.slides.internal.k9.h0)var23.getKey())) {
                     ((com.aspose.slides.internal.k9.u9)var23.getValue()).k5().dispose();
                     var5.l6(var23.getKey());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
                  var22.dispose();
               }
            }
         }
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }
   }

   private com.aspose.slides.internal.o9b.l6[] n5(y4x var1, com.aspose.slides.internal.o9b.p8 var2) {
      List var3 = new List();
      com.aspose.slides.internal.o9b.p8 var4 = var2.u3();
      c2m var5 = this.n5.j5();

      try {
         if (!this.k5() && !this.u3()) {
            for (int var16 = 0; var16 < this.n5.getSlides().size(); var16++) {
               if (this.n3.containsItem(var16 + 1)) {
                  Slide var17 = (Slide)this.n5.getSlides().get_Item(var16);
                  if (var17 != null && !var17.getHidden()) {
                     var3.addItem(var17.t4().l6(var4.u3()));
                  }
               }
            }
         } else {
            IGenericEnumerator var6 = this.n5.getSlides().iterator();

            try {
               while (var6.hasNext()) {
                  Slide var7 = (Slide)var6.next();
                  if (var7 != null && !var7.getHidden()) {
                     if (this.k5()) {
                        var3.addItem(((NotesSlide)var7.getNotesSlideManager().getNotesSlide()).t4().n5(var4.u3(), var1));
                     } else {
                        var3.addItem(var7.t4().l6(var4.u3()));
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return (com.aspose.slides.internal.o9b.l6[])var3.toArray(new com.aspose.slides.internal.o9b.l6[0]);
   }

   private com.aspose.slides.internal.o9b.l6[] n5(y4x var1, float var2, float var3) {
      new com.aspose.slides.internal.o9b.p8();
      com.aspose.slides.internal.o9b.p8 var4;
      if (this.k5()) {
         var4 = new com.aspose.slides.internal.o9b.p8(
            com.aspose.slides.internal.v6g.k5.u3(((NotesSize)this.n5.getNotesSize()).n5().l6() * var2, 13),
            com.aspose.slides.internal.v6g.k5.u3(((NotesSize)this.n5.getNotesSize()).n5().k5() * var3, 13)
         );
      } else {
         var4 = new com.aspose.slides.internal.o9b.p8(
            com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.n5.getSlideSize()).n5().l6() * var2, 13),
            com.aspose.slides.internal.v6g.k5.u3(((SlideSize)this.n5.getSlideSize()).n5().k5() * var3, 13)
         );
      }

      return this.n5(var1, var4.u3());
   }

   private void t2() {
      List var1 = new List();
      if (this.n5.getMasterNotesSlideManager().getMasterNotesSlide() != null) {
         IGenericEnumerator var2 = this.n5.getMasterNotesSlideManager().getMasterNotesSlide().getShapes().iterator();

         try {
            while (var2.hasNext()) {
               IShape var3 = (IShape)var2.next();
               if (var3.getPlaceholder() == null) {
                  var1.addItem(var3);
               } else if (var3.getPlaceholder().getType() == 6) {
                  this.l6 = var3.getY();
               } else if (var3.getPlaceholder().getType() == 7) {
                  this.k5 = var3.getY() + var3.getHeight();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      if (this.l6 == 0.0F) {
         this.l6 = ((NotesSize)this.n5.getNotesSize()).n5().k5() - 20.0F;
      }

      if (this.k5 == 0.0F) {
         this.k5 = 20.0F;
      }

      List$Enumerator var12 = var1.iterator();

      try {
         while (var12.hasNext()) {
            IShape var13 = (IShape)var12.next();
            if (var13.getY() + var13.getHeight() > ((NotesSize)this.n5.getNotesSize()).n5().k5() / 2.0F) {
               if (var13.getY() > 0.0F && var13.getY() < this.l6) {
                  this.l6 = var13.getY();
               }
            } else if (var13.getY() + var13.getHeight() > this.k5) {
               this.k5 = var13.getY() + var13.getHeight();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   private Portion n5(String var1) {
      Portion var2 = new Portion();
      var2.getPortionFormat().setFontHeight(8.0F);
      var2.getPortionFormat().setLatinFont(this.a6);
      var2.getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var2.getPortionFormat().getFillFormat().getSolidFillColor()).n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var2.setText(var1);
      return var2;
   }

   private ITable n5(IBaseSlide var1) {
      float var2 = this.k5() ? ((NotesSize)this.n5.getNotesSize()).n5().l6() : ((SlideSize)this.n5.getSlideSize()).n5().l6();
      ITable var3 = var1.getShapes().addTable(75.0F, 50.0F, new double[]{75.0, var2 - 225.0F}, new double[]{1.0, 1.0});
      var3.mergeCells(var3.get_Item(0, 0), var3.get_Item(1, 0), false);
      var3.setStylePreset(3);
      if (this.a6 != null) {
         var3.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.a6);
         var3.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.a6);
         var3.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.a6);
      }

      var3.get_Item(0, 0).setMarginLeft(0.0);
      var3.get_Item(0, 1).setMarginLeft(0.0);
      var3.get_Item(1, 1).setMarginLeft(0.0);
      var3.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var3.get_Item(0, 0)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var3.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold((byte)1);
      var3.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(12.0F);
      var3.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var3.get_Item(0, 1)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var3.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontBold((byte)1);
      var3.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0F);
      var3.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var3.get_Item(1, 1)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var3.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0F);
      return var3;
   }

   private ITable l6(IBaseSlide var1) {
      float var2 = this.k5() ? ((NotesSize)this.n5.getNotesSize()).n5().l6() : ((SlideSize)this.n5.getSlideSize()).n5().l6();
      ITable var3 = var1.getShapes()
         .addTable(var2 - this.x8.getCommentsAreaWidth() + 5.0F, 5.0F, new double[]{this.t2, this.x8.getCommentsAreaWidth() - 10 - this.t2}, new double[]{1.0});
      var3.setStylePreset(3);
      if (this.a6 != null) {
         var3.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setLatinFont(this.a6);
      }

      var3.get_Item(0, 0).setMarginLeft(0.0);
      var3.get_Item(0, 0).setMarginRight(0.0);
      var3.get_Item(1, 0).setMarginLeft(0.0);
      var3.get_Item(1, 0).setMarginRight(0.0);
      var3.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var3.get_Item(0, 0)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var3.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0F);
      var3.get_Item(1, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var3.get_Item(1, 0)
            .getTextFrame()
            .getParagraphs()
            .get_Item(0)
            .getPortions()
            .get_Item(0)
            .getPortionFormat()
            .getFillFormat()
            .getSolidFillColor())
         .n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var3.get_Item(1, 0).getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0F);
      return var3;
   }

   private void l6(ISlide var1) {
      for (IComment var5 : var1.getSlideComments(null)) {
         if (this.x8.getShowCommentsByNoAuthor() || !"n/a".equals(var5.getAuthor().getInitials())) {
            String var6 = var5.getAuthor().getInitials();
            if ("n/a".equals(var6)) {
               var6 = "";
            }

            IAutoShape var7 = var1.getShapes().addAutoShape(5, ((Comment)var5).l6().l6(), ((Comment)var5).l6().k5(), 50.0F, 20.0F);
            ITextFrame var8 = var7.addTextFrame(com.aspose.slides.ms.System.d1.n5(new String[]{var6, com.aspose.slides.ms.System.l4.l6(((Comment)var5).u3().n5())}));
            ((TextFrameFormat)var8.getTextFrameFormat()).n5(c0u.n5.l6());
            var8.getTextFrameFormat().setAutofitType((byte)2);
            var8.getTextFrameFormat().setWrapText((byte)0);
            var8.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
            ((ColorFormat)var8.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor())
               .n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            var7.getFillFormat().setFillType((byte)1);
            ((ColorFormat)var7.getFillFormat().getSolidFillColor()).n5(this.n5(var5).o8());
         }
      }
   }

   final com.aspose.slides.internal.o9b.c8 n5(IComment var1) {
      switch ((int)((((CommentAuthor)var1.getAuthor()).u3() & 4294967295L) % 9L & 4294967295L)) {
         case 1:
            return com.aspose.slides.internal.o9b.c8.p7();
         case 2:
            return com.aspose.slides.internal.o9b.c8.b5();
         case 3:
            return com.aspose.slides.internal.o9b.c8.u5();
         case 4:
            return com.aspose.slides.internal.o9b.c8.o7();
         case 5:
            return com.aspose.slides.internal.o9b.c8.q1();
         case 6:
            return com.aspose.slides.internal.o9b.c8.r1();
         case 7:
            return com.aspose.slides.internal.o9b.c8.b5();
         case 8:
            return com.aspose.slides.internal.o9b.c8.w5();
         default:
            return com.aspose.slides.internal.o9b.c8.c2();
      }
   }

   private IBaseSlide n5(ISlide var1, com.aspose.slides.internal.o9b.f2[] var2, int[] var3) {
      IBaseSlide var5;
      if (this.k5()) {
         ISlide var4 = this.n5.getSlides().insertClone(++var3[0], var1);
         if (var4.getNotesSlideManager().getNotesSlide() == null) {
            var5 = var4.getNotesSlideManager().addNotesSlide();
         } else {
            var5 = var4.getNotesSlideManager().getNotesSlide();
         }

         ((NotesSize)this.n5.getNotesSize()).n5().l6(var2[0]);
         var5.getShapes().clear();
      } else {
         IMasterSlide var7 = ((MasterSlideCollection)this.n5.getMasters()).n5();
         LayoutSlide var6 = new LayoutSlide(var7, (byte)11);
         var5 = this.n5.getSlides().insertEmptySlide(++var3[0], var6);
         ((SlideSize)this.n5.getSlideSize()).n5().l6(var2[0]);
         var5.getShapes().clear();
      }

      return var5;
   }

   private void n5(IBaseSlide var1, float var2, float var3, boolean var4) {
      float var5 = 30.0F;
      float var6 = 15.0F;
      float var7 = 10.0F;
      IAutoShape var8 = var1.getShapes().addAutoShape(26, var2, var3, 30.0F, 15.0F);
      var8.addTextFrame("...");
      var8.getTextFrame().getTextFrameFormat().setMarginBottom(var7);
      if (var4) {
         var8.getFillFormat().setFillType((byte)1);
         ((ColorFormat)var8.getFillFormat().getSolidFillColor()).n5(this.x8.n5().o8());
      } else {
         var8.setUseBackgroundFill(true);
      }

      var8.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var8.getShapeStyle().getLineColor()).n5(com.aspose.slides.internal.o9b.c8.j3().o8());
      var8.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(12.0F);
   }
}
