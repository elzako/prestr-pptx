package com.aspose.slides;

class p4z {
   public static void n5(String var0, Presentation var1) {
      s4r.n5(var1);
      var1.getSlides().removeAt(0);
      String[] var2 = com.aspose.slides.ms.System.d1.n5(var0, new String[]{"\r\n"}, 0);
      ISlide var3 = null;
      ITextFrame var4 = null;

      for (int var5 = 0; var5 < var2.length; var5++) {
         String var6 = var2[var5];
         if (var6 != null) {
            String var7 = com.aspose.slides.ms.System.d1.a6(var6, new char[]{});
            if (!var7.isEmpty()) {
               int var8 = n5(var7);
               String var9 = com.aspose.slides.ms.System.d1.u3(var7,new char[]{ '\t'});
               var9 = com.aspose.slides.ms.System.d1.l6(var9);
               if (!var9.isEmpty()) {
                  if (var8 == 0) {
                     var3 = n5(var1);
                     n5(var3, var9);
                     var4 = l6(var3);
                     if (var4 != null) {
                        var4.getParagraphs().clear();
                     }
                  } else {
                     if (var3 == null) {
                        var3 = n5(var1);
                        n5(var3, "");
                        var4 = l6(var3);
                        if (var4 != null) {
                           var4.getParagraphs().clear();
                        }
                     }

                     if (var4 == null) {
                        var4 = k5(var3);
                     }

                     n5(var4, var9, var8 - 1);
                  }
               }
            }
         }
      }
   }

   private static int n5(String var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length(); var2++) {
         char var3 = var0.charAt(var2);
         if (var3 != '\t') {
            break;
         }

         var1++;
      }

      return var1;
   }

   private static ISlide n5(Presentation var0) {
      ILayoutSlide var1 = null;

      for (int var2 = 0; var2 < var0.getLayoutSlides().size(); var2++) {
         ILayoutSlide var3 = var0.getLayoutSlides().get_Item(var2);
         if (var3.getLayoutType() == 15) {
            var1 = var3;
            break;
         }
      }

      var1 = var1 == null ? var0.getLayoutSlides().get_Item(0) : var1;
      return var0.getSlides().addEmptySlide(var1);
   }

   private static void n5(ISlide var0, String var1) {
      IAutoShape var2 = n5(var0);
      if (var2 != null) {
         if (var2.getTextFrame() == null) {
            var2.addTextFrame("");
         }

         var2.getTextFrame().setText(var1);
      } else {
         IAutoShape var3 = var0.getShapes().addAutoShape(5, 20.0F, 10.0F, 680.0F, 60.0F);
         var3.addTextFrame(var1);
      }
   }

   private static IAutoShape n5(ISlide var0) {
      for (int var1 = 0; var1 < var0.getShapes().size(); var1++) {
         IShape var2 = var0.getShapes().get_Item(var1);
         IAutoShape var3 = com.aspose.slides.internal.v6g.k5.n5(var2, IAutoShape.class);
         if (var3 != null && var3.getPlaceholder() != null && var3.getPlaceholder().getType() == 0) {
            return var3;
         }
      }

      return null;
   }

   private static ITextFrame l6(ISlide var0) {
      for (int var1 = 0; var1 < var0.getShapes().size(); var1++) {
         IShape var2 = var0.getShapes().get_Item(var1);
         IAutoShape var3 = com.aspose.slides.internal.v6g.k5.n5(var2, IAutoShape.class);
         if (var3 != null && var3.getPlaceholder() != null) {
            byte var4 = var3.getPlaceholder().getType();
            if (var4 == 1 || var4 == 8) {
               if (var3.getTextFrame() == null) {
                  var3.addTextFrame("");
               }

               return var3.getTextFrame();
            }
         }
      }

      return null;
   }

   private static ITextFrame k5(ISlide var0) {
      IAutoShape var1 = var0.getShapes().addAutoShape(5, 60.0F, 100.0F, 620.0F, 380.0F);
      var1.addTextFrame("");
      return var1.getTextFrame();
   }

   private static void n5(ITextFrame var0, String var1, int var2) {
      if (var0 != null) {
         Paragraph var3 = new Paragraph();
         var0.getParagraphs().add(var3);
         var3.setText(var1);
         var3.getParagraphFormat().getBullet().setType((byte)1);
         var3.getParagraphFormat().getBullet().setChar('•');
         if (var2 < 0) {
            var2 = 0;
         }

         var3.getParagraphFormat().setDepth((short)var2);
      }
   }
}
