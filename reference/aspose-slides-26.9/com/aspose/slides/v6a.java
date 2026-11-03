package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

class v6a {
   private List<String> n5 = new List<>();
   private com.aspose.slides.internal.l7h.a5 l6;
   private boolean k5;
   private int u3 = 0;
   private TextToHtmlConversionOptions a6;
   private boolean u9 = true;

   static String n5(Paragraph[] var0, TextToHtmlConversionOptions var1, BaseSlide var2, r0s var3) {
      ILinkEmbedController var4 = var1.getLinkEmbedController();
      v3s var5 = new v3s();
      if (var4 == null) {
         var4 = com.aspose.slides.internal.k0r.f0.n5;
      }

      com.aspose.slides.internal.f3.n5 var6 = new com.aspose.slides.internal.f3.n5<>(com.aspose.slides.ms.System.u3.n5(var0), new v6a$1());
      String[] var7 = v6o.n5(var6, var0.length, false);
      com.aspose.slides.internal.l7h.a5 var8 = new com.aspose.slides.internal.l7h.a5();
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      if (var1.getAddClipboardFragmentHeader()) {
         var8.n5("Version:1.0\r\nStartHTML:!HTMLSTART\r\nEndHTML:!HTMLEND!!\r\nStartFragment:!FRAGSTART\r\nEndFragment:!FRAGEND!!\r\n\r\n");
      }

      v6a var13 = new v6a(var8, var1);
      var9 = var13.l6.l6();
      var13.n5("html");
      var13.n5("head");
      var13.l6(
         "Content-Type",
         var1.getEncodingName() != null && !"".equals(var1.getEncodingName())
            ? com.aspose.slides.ms.System.d1.n5("text/html; charset={0}", new Object[]{var1.getEncodingName()})
            : "text/html"
      );
      var13.n5("ProgId", "PowerPoint.Slide");
      var13.n5("Generator", "Aspose.Slides");
      var13.l6();
      var13.n5("body");
      if (var1.getAddClipboardFragmentHeader()) {
         var13.u3("StartFragment");
         var13.l6.n5("\r\n\r\n");
         var13.u3 = 0;
      }

      var11 = var13.l6.l6();

      for (int var14 = 0; var14 < var0.length; var14++) {
         Paragraph var15 = var0[var14];
         IParagraphFormat var16 = var15.getParagraphFormat();
         boolean var17 = var16.getBullet().getType() != -1 && var16.getBullet().getType() != 0 && var15.u3().length() > 0;
         if (var17) {
            var13.n5("div");
         } else {
            var13.n5("p");
         }

         var13.k5("style", a2s.n5(var16));
         if (var16.getDepth() > 0) {
            var13.k5("class", com.aspose.slides.ms.System.d1.n5(new String[]{"O", com.aspose.slides.ms.System.f0.l6(var16.getDepth())}));
         }

         if (var17) {
            if (var16.getBullet().getType() == 3) {
               String var28 = null;
               if (((BulletFormat)var16.getBullet()).getPicture().getImage() != null) {
                  IPPImage var19 = ((BulletFormat)var16.getBullet()).getPicture().getImage();
                  int var20 = 0;
                  byte[] var21 = var19.getBinaryData();
                  int[] var22 = new int[]{0};
                  int var23 = var5.n5(var4, var19, var21, "pictureBullet", var19.getContentType(), "image", var22);
                  var20 = var22[0];
                  if (var20 != 2) {
                     if (var20 == 0) {
                        var28 = var4.getUrl(var23, 0);
                     } else {
                        var28 = com.aspose.slides.ms.System.d1.n5("data:{0};base64,{1}",new Object[]{ var19.getContentType(), com.aspose.slides.ms.System.z3.n5(var21)});
                     }
                  }
               } else {
                  var28 = ((BulletFormat)var16.getBullet()).getPicture().getLinkPathLong();
               }

               if (var28 != null) {
                  if (var13.u9) {
                     var13.n5("span");
                     var13.k5("style", "mso-special-format: bullet");
                  }

                  var13.n5("img");
                  var13.k5("src", var28);
                  var13.k5("alt", "*");
                  var13.l6();
                  if (var13.u9) {
                     var13.l6();
                  }
               }
            } else {
               var13.n5("span");
               var13.k5("style", a2s.n5(var15, var13.u9, var2, var3));
               var13.l6(var7[var14]);
               var13.l6();
            }
         } else {
            String var18 = var15.u3();
            if ("".equals(var18)
               || var18.length() == 1
                  && var18.charAt(0) <= ' '
                  && var18.charAt(0) != '\t'
                  && var18.charAt(0) != 11
                  && var18.charAt(0) != '\n'
                  && var18.charAt(0) != '\r') {
               var13.l6(" ");
            }
         }

         for (int var29 = 0; var29 < var15.getPortions().getCount(); var29++) {
            Portion var30 = (Portion)var15.getPortions().get_Item(var29);
            var13.n5("span");
            var13.k5("style", a2s.n5(var30.getPortionFormat(), var13.u9, var2, var3));
            int var32 = 0;
            if (var30.getPortionFormat().getStrikethroughType() != -1 && var30.getPortionFormat().getStrikethroughType() != 0) {
               var13.n5("s");
               var32++;
            }

            if (var30.getPortionFormat().getFontUnderline() != -1 && var30.getPortionFormat().getFontUnderline() != 0) {
               var13.n5("u");
               var32++;
            }

            if (var30.getPortionFormat().getHyperlinkClick() != null && var30.getPortionFormat().getHyperlinkClick().getExternalUrl() != null) {
               var13.n5("a");
               var13.k5("href", var30.getPortionFormat().getHyperlinkClick().getExternalUrl());
               var32++;
            }

            var13.l6(var30.u9());

            while (var32-- > 0) {
               var13.l6();
            }

            var13.l6();
         }

         var13.l6();
      }

      var12 = var13.l6.l6();
      if (var1.getAddClipboardFragmentHeader()) {
         var13.l6.n5("\r\n\r\n");
         var13.u3("EndFragment");
      }

      var13.l6();
      var13.l6();
      var10 = var13.l6.l6();
      if (var1.getAddClipboardFragmentHeader()) {
         n5(var8, 23, var9);
         n5(var8, 43, var10);
         n5(var8, 69, var11);
         n5(var8, 93, var12);
      }

      return var8.toString();
   }

   private v6a(com.aspose.slides.internal.l7h.a5 var1, TextToHtmlConversionOptions var2) {
      this.l6 = var1;
      this.a6 = var2;
   }

   private void n5(String var1, String var2) {
      this.n5("meta");
      this.k5("name", var1);
      this.k5("content", var2);
      this.l6();
   }

   private void l6(String var1, String var2) {
      this.n5("meta");
      this.k5("http-equiv", var1);
      this.k5("content", var2);
      this.l6();
   }

   private static void n5(com.aspose.slides.internal.l7h.a5 var0, int var1, int var2) {
      String var3 = com.aspose.slides.ms.System.a3.n5(var2, "d10");

      for (int var4 = 0; var4 < var3.length(); var4++) {
         var0.n5(var1 + var4, var3.charAt(var4));
      }
   }

   private void n5(String var1) {
      if (this.k5) {
         this.n5();
      }

      this.l6.n5("<{0}",new Object[]{ var1});
      this.k5 = true;
      this.n5.addItem(var1);
   }

   private void n5() {
      this.k5 = false;
      this.n5(">", false, false);
   }

   private void l6(String var1) {
      if (this.k5) {
         this.n5();
      }

      int var2 = 0;
      int var3 = 0;

      while (var3 < var1.length()) {
         char var4 = var1.charAt(var3);
         if (var4 == '<') {
            if (var2 < var3) {
               this.n5(var1, var2, var3 - var2, false, false);
            }

            this.n5("&lt;", false, false);
            var2 = ++var3;
         } else if (var4 == '>') {
            if (var2 < var3) {
               this.n5(var1, var2, var3 - var2, false, false);
            }

            this.n5("&gt;", false, false);
            var2 = ++var3;
         } else if (var4 == '&') {
            if (var2 < var3) {
               this.n5(var1, var2, var3 - var2, false, false);
            }

            this.n5("&amp;", false, false);
            var2 = ++var3;
         } else if (var4 <= ' ') {
            if (var2 < var3) {
               this.n5(var1, var2, var3 - var2, false, false);
            }

            if (var4 != '\n' && var4 != '\r' && var4 != 11) {
               if (var4 == '\t') {
                  int var7 = var3 + 1;

                  while (var7 < var1.length() && var1.charAt(var7) == '\t') {
                     var7++;
                  }

                  if (this.u9) {
                     this.n5("span");
                     this.k5("style", com.aspose.slides.ms.System.d1.n5("mso-tab-count:{0}", new Object[]{var7 - var3}));
                     this.n5();
                  }

                  while (var3 < var7) {
                     var3++;
                     this.n5("  ", true, true);
                  }

                  if (this.u9) {
                     this.l6();
                  }

                  var2 = var3;
               } else {
                  int var5 = var3 + 1;

                  while (
                     var5 < var1.length()
                        && var1.charAt(var5) <= ' '
                        && var1.charAt(var5) != '\t'
                        && var1.charAt(var5) != '\n'
                        && var1.charAt(var5) != '\r'
                        && var1.charAt(var5) != 11
                  ) {
                     var5++;
                  }

                  boolean var6 = this.u9 && var3 + 1 < var5;
                  if (var6) {
                     this.n5("span");
                     this.k5("style", "mso-spacerun:yes");
                     this.n5();
                  }

                  while (var3 < var5 - 1) {
                     var3++;
                     this.n5(' ', false, false);
                  }

                  if (var6) {
                     this.l6();
                  }

                  this.k5();
                  var2 = ++var3;
               }
            } else {
               this.n5("br");
               this.l6();
               var2 = ++var3;
            }
         } else {
            var3++;
         }
      }

      if (var2 < var3) {
         this.n5(var1, var2, var3 - var2, false, false);
      }
   }

   private void k5(String var1, String var2) {
      if (!this.k5) {
         throw new InvalidOperationException("Trying to write element without element tag opening");
      }

      if (var1 != null && var2 != null) {
         this.k5();
         this.n5(var1, true, false);
         this.n5("=\"", true, false);
         this.n5(this.k5(var2), false, false);
         this.n5('"', false, false);
      }
   }

   private String k5(String var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(var1.length() + var1.length() / 8);

      for (int var3 = 0; var3 < var1.length(); var3++) {
         if (var1.charAt(var3) == '&') {
            var2.n5("&amp;");
         } else if (var1.charAt(var3) == '"') {
            var2.n5("&quot;");
         } else {
            var2.n5(var1.charAt(var3));
         }
      }

      return var2.toString();
   }

   private void l6() {
      if (this.k5) {
         this.n5("/>", false, false);
      } else {
         this.n5(com.aspose.slides.ms.System.d1.n5("</{0}>", new Object[]{this.n5.get_Item(this.n5.size() - 1)}), false, false);
      }

      this.n5.removeAt(this.n5.size() - 1);
      this.k5 = false;
   }

   private void u3(String var1) {
      if (this.k5) {
         this.n5();
      }

      if (com.aspose.slides.ms.System.d1.c8(var1, "--") >= 0) {
         var1 = com.aspose.slides.ms.System.d1.n5(var1, "--", "-- -->\r\n<!-- ");
      }

      this.l6.n5("\r\n<!-- ");
      this.l6.n5(var1);
      this.l6.n5("-->\r\n");
      this.u3 = 0;
   }

   private void n5(String var1, boolean var2, boolean var3) {
      this.n5(var1, 0, var1.length(), var2, var3);
   }

   private void n5(String var1, int var2, int var3, boolean var4, boolean var5) {
      if (var4 && (this.u3 >= 80 || this.u3 + var3 >= 80)) {
         this.l6.n5("\r\n");
         this.u3 = 0;
      }

      this.l6.n5(var1, var2, var3);
      this.u3 += var3;
      if (var5 && this.u3 >= 80) {
         this.l6.n5("\r\n");
         this.u3 = 0;
      }
   }

   private void n5(char var1, boolean var2, boolean var3) {
      if (var2 && this.u3 >= 80) {
         this.l6.n5("\r\n");
         this.u3 = 0;
      }

      this.l6.n5(var1);
      this.u3++;
      if (var3 && this.u3 >= 80) {
         this.l6.n5("\r\n");
         this.u3 = 0;
      }
   }

   private void k5() {
      if (this.u3 >= 80) {
         this.l6.n5("\r\n");
         this.u3 = 0;
      } else {
         this.l6.n5(' ');
         this.u3++;
      }
   }
}
