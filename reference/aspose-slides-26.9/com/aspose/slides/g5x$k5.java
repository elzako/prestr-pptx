package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class g5x$k5 {
   private List<g5x$l6> n5 = new List<>();
   private final s3f l6;
   private int k5;
   private int u3 = 0;
   private int a6;
   private int u9;
   private int h0;

   g5x$k5(String var1, s3f var2) {
      this.l6 = var2;
      int var3 = var1.length();
      if (var3 < 1) {
         g5x$l6 var9 = new g5x$l6(this.l6);
         var9.n5 = com.aspose.slides.ms.System.d1.n5(new Object[]{"", '\r'});
         this.n5 = new List<>();
         this.n5.addItem(var9);
      } else {
         this.n5 = new List<>();
         char[] var4 = new char[]{'\r'};
         int var5 = 0;
         int var6 = 0;

         while (var6 < var3) {
            int var7 = com.aspose.slides.ms.System.d1.n5(var1, var4, var6);
            if (var7 < 0) {
               if (var6 < var3) {
                  g5x$l6 var8 = new g5x$l6(this.l6);
                  this.n5.addItem(var8);
                  var8.n5 = com.aspose.slides.ms.System.d1.l6(var1, var6, var3 - var6);
                  var8.l6 = var5;
                  var6 = var3;
               }
            } else {
               if (var7 > var6) {
                  g5x$l6 var11 = new g5x$l6(this.l6);
                  this.n5.addItem(var11);
                  var11.n5 = com.aspose.slides.ms.System.d1.l6(var1, var6, var7 - var6);
                  var11.l6 = var5;
               }

               g5x$l6 var12 = new g5x$l6(this.l6);
               this.n5.addItem(var12);
               var12.n5 = com.aspose.slides.ms.System.d1.n5(new Object[]{"", '\r'});
               var12.l6 = var5++;
               var6 = var7 + 1;
            }
         }

         if (!this.l6()) {
            g5x$l6 var13 = new g5x$l6(this.l6);
            this.n5.addItem(var13);
            var13.n5 = com.aspose.slides.ms.System.d1.n5(new Object[]{"", '\r'});
            var13.l6 = var5++;
         }
      }
   }

   final void n5() {
      this.l6(0);
      this.u3 = 0;
      this.h0 = 0;
   }

   final boolean l6() {
      return this.n5.size() == 0;
   }

   final boolean k5() {
      return this.u3 > 0;
   }

   private void l6(int var1) {
      if (var1 >= 0 && var1 < this.n5.size()) {
         this.k5 = var1;
         this.u9 = this.n5.get_Item(this.k5).n5.length();
         this.a6 = 0;
      }
   }

   final void n5(int var1) {
      if (this.k5()) {
         throw new PptException("The previous run isn't depleted!");
      }

      this.u3 = var1;
   }

   final g5x$l6 u3() {
      while (this.u3 > 0) {
         g5x$l6 var1 = null;
         int var2 = this.u9 - this.a6;
         if (this.u3 >= var2) {
            this.h0 += var2;
            this.u3 -= var2;
            var1 = this.n5.get_Item(this.k5);
            this.l6(this.k5 + 1);
         } else {
            this.h0 = this.h0 + this.u3;
            this.a6 = this.a6 + this.u3;
            this.u3 = 0;
            g5x$l6 var3 = new g5x$l6(this.n5.get_Item(this.k5), this.a6, this.l6);
            var1 = this.n5.get_Item(this.k5);
            this.n5.insertItem(++this.k5, var3);
            this.l6(this.k5);
         }

         if (var1 != null) {
            return var1;
         }
      }

      return null;
   }

   final void n5(com.aspose.slides.internal.k0r.w4w var1) {
      this.n5();

      for (com.aspose.slides.internal.k0r.o5k var5 : var1.l6()) {
         this.n5((int)var5.n5());

         while (this.k5()) {
            g5x$l6 var6 = this.u3();
            if (var6 != null) {
               var6.u3 = var5;
               var6.k5 = (short)var5.l6();
               var6.a6 = var5.k5();
            }
         }
      }

      this.n5();

      for (com.aspose.slides.internal.k0r.l8r var10 : var1.k5()) {
         this.n5((int)var10.n5());

         while (this.k5()) {
            g5x$l6 var11 = this.u3();
            if (var11 != null) {
               var11.u9 = var10;
               var11.h0 = var10.l6();
            }
         }
      }
   }

   final void n5(com.aspose.slides.internal.k0r.n8 var1) {
      this.n5();
      List$Enumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.k0r.t0 var3 = (com.aspose.slides.internal.k0r.t0)var2.next();
            this.n5((int)var3.n5());

            while (this.k5()) {
               g5x$l6 var4 = this.u3();
               if (var4 != null) {
                  var4.k5 = (short)var3.l6();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final void n5(com.aspose.slides.internal.k0r.c9t var1) {
      this.n5();

      for (com.aspose.slides.internal.k0r.p2i var5 : var1.l6()) {
         this.n5((int)var5.n5());

         while (this.k5()) {
            g5x$l6 var6 = this.u3();
            if (var6 != null) {
               var6.c8 = var5.l6();
            }
         }
      }
   }

   public final void n5(List<com.aspose.slides.internal.k0r.r6a> var1, com.aspose.slides.internal.k0r.i8 var2) {
      List$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k0r.r6a var4 = (com.aspose.slides.internal.k0r.r6a)var3.next();
            this.n5();
            if (var4.k5() > 0) {
               this.n5(var4.k5());

               while (this.k5()) {
                  this.u3();
               }
            }

            this.n5(1);
            g5x$l6 var5 = this.u3();
            if (var5 != null) {
               switch (var4.r4() & 65535) {
                  case 4056:
                     var5.x8 = 20;
                     break;
                  case 4087:
                     com.aspose.slides.internal.k0r.a0 var6 = (com.aspose.slides.internal.k0r.a0)var4;
                     var5.x8 = var6.l6() & 255;
                     break;
                  case 4088:
                     if (var2 != null) {
                        var5.x8 = var2.l6().l6();
                     } else {
                        var5.x8 = 0;
                     }
                     break;
                  case 4089:
                     var5.x8 = 22;
                     break;
                  case 4090:
                     var5.x8 = 21;
                     break;
                  case 4117:
                     com.aspose.slides.internal.k0r.f6 var7 = (com.aspose.slides.internal.k0r.f6)var4;
                     if (var7.k5() > -1 && var7.k5() < var5.n5.length()) {
                        var5.n5 = com.aspose.slides.ms.System.d1.n5(var5.n5, com.aspose.slides.ms.System.t9.q0(var5.n5.charAt(var7.k5())), var7.l6());
                     }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   final void n5(List<com.aspose.slides.internal.k0r.b1> var1, p3f var2) {
      if (var1 != null && var1.size() >= 1) {
         SortedList var3 = new SortedList();
         SortedList var4 = new SortedList();
         com.aspose.slides.internal.k0r.k6 var5 = null;
         boolean var6 = false;

         for (int var7 = 0; var7 < var1.size(); var7++) {
            if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var7), com.aspose.slides.internal.k0r.o7.class)) {
               var5 = ((com.aspose.slides.internal.k0r.o7)var1.get_Item(var7)).l6();
               if (var5 != null) {
                  var6 = true;
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var7), com.aspose.slides.internal.k0r.c7f.class) && var6) {
               var6 = false;
               com.aspose.slides.internal.k0r.c7f var8 = (com.aspose.slides.internal.k0r.c7f)var1.get_Item(var7);
               int var9 = var8.l6();
               int var10 = var8.k5() - var9;
               if (var10 > 0) {
                  g5x$k5$n5 var11 = new g5x$k5$n5();
                  var11.n5 = var10;
                  var11.l6 = var5;
                  if (var8.y2() == 1) {
                     this.n5(var3, var9, var11.n5());
                  } else {
                     this.n5(var4, var9, var11.n5());
                  }
               }
            }
         }

         this.n5(var3, true, var2.l6());
         this.n5(var4, false, var2.l6());
      }
   }

   final void n5(p3f var1) {
      d5f var2 = var1.c8();
      TextFrame var3 = var1.h0();
      IParagraphCollection var4 = var3.getParagraphs();
      var4.clear();
      if (!this.l6()) {
         int var5 = this.n5.size();
         this.n5.get_Item(var5 - 1).n5 = com.aspose.slides.ms.System.d1.n5(this.n5.get_Item(var5 - 1).n5, this.n5.get_Item(var5 - 1).n5.length() - 1);
         int var6 = -1;
         com.aspose.slides.internal.k0r.t9p var7 = var1.u9();
         Paragraph var8 = null;
         com.aspose.slides.internal.k0r.n9q var9 = null;
         com.aspose.slides.internal.k0r.u7f var10 = null;
         ParagraphFormat var11 = new ParagraphFormat(null);
         ParagraphFormat var12 = null;
         PortionFormat var13 = null;
         boolean var14 = false;

         for (int var15 = 0; var15 < var5; var15++) {
            g5x$l6 var16 = this.n5.get_Item(var15);
            ParagraphFormat var17 = null;
            if (var3.n5.h0() != null) {
               var17 = (ParagraphFormat)var3.n5.h0().getLevel(var16.k5);
            }

            com.aspose.slides.internal.k0r.l1b var18 = null;
            if (var16.n5() != null && var16.n5().a6()[0] != null) {
               var18 = var16.n5().a6()[0];
            }

            if (var9 != var16.a6) {
               var9 = var16.a6;
               if (var9 != null) {
                  var12 = new ParagraphFormat(var11, var3);
                  f8b.n5(var9, null, var12, var2);
                  var12.setDepth(var16.k5);
               } else {
                  var12 = null;
               }
            }

            com.aspose.slides.internal.k0r.u7f var19 = null;
            if (var18 != null) {
               if (var16.h0 == null) {
                  var19 = var18.l6();
               } else if (this.n5(var16.h0)) {
                  var19 = new com.aspose.slides.internal.k0r.u7f();
                  var19.n5(var16.h0);
                  this.n5(var19, var18.l6());
               }
            }

            if (var10 != var16.h0) {
               var10 = var16.h0;
               var13 = new PortionFormat(var12);
               if (var10 != null) {
                  f8b.n5(var10, var13, ((Presentation)var3.getPresentation()).z1().n5(), var1);
                  f8b.n5(var13, var1);
                  if (var17 != null && var13.getEffectFormat().getOuterShadowEffect() != null && var13.getFillFormat().getFillType() == -1) {
                     FillFormat var20 = var17.u3().a6();
                     if (var20 != null
                        && var20.getFillType() == 1
                        && com.aspose.slides.ms.System.q1.n5((double)(((ColorFormat)var20.getSolidFillColor()).u3().c8()), 2) <= 0.5) {
                        ((ColorFormat)var13.getEffectFormat().getOuterShadowEffect().getShadowColor()).n5(com.aspose.slides.internal.o9b.c8.w4().o8());
                     }
                  }

                  if (var18 != null && var17 != null) {
                     if (var13.getFontBold() == 0 && var17.u3().getFontBold() == 0 && var18.l6().n5() == 0) {
                        var13.setFontBold((byte)1);
                     }

                     if (var13.getFontItalic() == 0 && var17.u3().getFontItalic() == 0 && var18.l6().l6() == 0) {
                        var13.setFontItalic((byte)1);
                     }
                  }
               }
            }

            if (var7 != null) {
               byte var29 = 0;
               if (var17 != null && var17.l6().u9().n5().l6()) {
                  var29 = var17.l6().u9().n5().n5();
               }

               if (var10 != null && var10.c8().l6()) {
                  var29 = var10.c8().n5();
               }

               boolean var21 = var9 != null && !var9.j5() && var12.l6().getType() != 0;
               g5x.n5(var12, var17, var29, var7, var2, var21);
            }

            if (var6 != var16.l6) {
               var14 = false;
               var6 = var16.l6;
               var8 = new Paragraph();
               var4.add(var8);
               var8.getPortions().clear();
            }

            if (!var14) {
               if (var12 != null) {
                  ((ParagraphFormat)var8.getParagraphFormat()).n5(var12);
                  var14 = true;
               }

               var8.getParagraphFormat().setDepth(var16.k5);
            }

            if (var16.n5.length() == 1 && var16.n5.charAt(0) == '\r') {
               var16.n5 = "";
            }

            Portion var30 = new Portion(var16.n5);
            IPortionFormat var31 = var30.getPortionFormat();
            if (var16.c8 != null) {
               if (var13 == null) {
                  var13 = (PortionFormat)var30.getPortionFormat();
               }

               f8b.n5(var16.c8, var12, var13);
            }

            if (var15 + 1 == var5 && var16.n5.length() == 0 && var16.h0 != null && var8 != null && var5 > 1) {
               var8.setEndParagraphPortionFormat(var31);
            } else {
               var8.getPortions().add(var30);
            }

            if (var13 != null) {
               ((PortionFormat)var31).n5(var13);
            }

            if (var19 != null) {
               PortionFormat var22 = new PortionFormat((ParagraphFormat)var8.getParagraphFormat());
               f8b.n5(var19, var22, ((Presentation)var3.getPresentation()).z1().n5(), var1);
               this.n5(var22, var2.n5().z1().n5());
            }

            if (var7 != null) {
               short var32 = 0;
               if (var10 != null && var10.c8().l6()) {
                  var32 = (short)(var10.c8().n5() & 0xFF);
               }

               if (var32 < var7.l6().size()) {
                  com.aspose.slides.internal.k0r.v9e var23 = var7.l6().get_Item(var32);
                  if (!var23.k5().t2()) {
                     ((PortionFormat)var31).q0().n5(var23.k5().k5());
                  }
               }
            }

            if (var16.x8 != -1) {
               switch (var16.x8) {
                  case 20:
                     var30.addField(FieldType.getSlideNumber());
                     if (com.aspose.slides.ms.System.d1.t2(var30.u9(), "*")) {
                        var30.n5(com.aspose.slides.ms.System.d1.n5(var30.u9(), "*", com.aspose.slides.ms.System.d1.n5(new String[]{"‹", "#", "›"})));
                     }
                     break;
                  case 21:
                     this.n5(var30, FieldType.getFooter(), var1);
                     break;
                  case 22:
                     this.n5(var30, FieldType.getHeader(), var1);
                     break;
                  default:
                     if (var16.x8 >= 0 && var16.x8 < 17) {
                        if (com.aspose.slides.ms.System.d1.n5(var30.l6().getLanguageId())
                           && com.aspose.slides.ms.System.d1.n5(var30.l6().getAlternativeLanguageId())
                           && var17 != null) {
                           var30.l6().setLanguageId(var17.u3().getLanguageId());
                           var30.l6().setAlternativeLanguageId(var17.u3().getAlternativeLanguageId());
                        }

                        String var33 = s1f.n5(var16.x8, f8b.n5(var31.getLanguageId()).k5());
                        var30.addField(var33);
                     }
               }
            }

            if (var16.t2 != null) {
               var16.t2.n5(var31);
               var31.setHyperlinkClick(var16.t2);
            }

            if (var16.s7 != null) {
               var16.s7.n5(var31);
               var31.setHyperlinkMouseOver(var16.s7);
            }

            if (((PortionFormat)var31).q0().l6() != null
               && var30.u9().length() > 1
               && var30.getField() == null
               && var31.getLatinFont() != null
               && (((FontData)var31.getLatinFont()).n5() & 255) > 2) {
               IFontData var34 = ((PortionFormat)var31).q0().l6();
               boolean var35 = false;
               boolean var24 = false;
               com.aspose.slides.internal.l7h.a5 var25 = new com.aspose.slides.internal.l7h.a5();

               for (int var26 = 0; var26 < var30.u9().length(); var26++) {
                  char var27 = var30.u9().charAt(var26);
                  var24 = com.aspose.slides.internal.n2d.u9.c4(var27);
                  if (var35 != var24 && var25.l6() > 0) {
                     Portion var28 = new Portion(var30);
                     var28.n5(var25.toString());
                     if (var35) {
                        var28.getPortionFormat().setLatinFont(var34);
                     }

                     var8.getPortions().add(var28);
                     var25.n5(0);
                  }

                  var25.n5(var27);
                  var35 = var24;
               }

               if (var25.l6() > 0) {
                  Portion var36 = new Portion(var30);
                  var36.n5(var25.toString());
                  if (var24) {
                     var36.getPortionFormat().setLatinFont(var34);
                  }

                  var8.getPortions().add(var36);
               }

               var8.getPortions().remove(var30);
            }
         }
      }
   }

   private void n5(SortedList<Integer, g5x$k5$n5> var1, int var2, g5x$k5$n5 var3) {
      g5x$k5$n5 var4 = new g5x$k5$n5();
      g5x$k5$n5[] var5 = new g5x$k5$n5[]{var4};
      boolean var6 = var1.tryGetValue(var2, var5);
      if (var6) {
         var5[0].n5(var4);
         if (var3.n5 > var4.n5) {
            var1.set_Item(var2, var3.n5());
         }
      } else {
         var1.addItem(var2, var3.n5());
      }
   }

   private void n5(SortedList<Integer, g5x$k5$n5> var1, boolean var2, a9x var3) {
      if (var1.size() != 0) {
         this.n5();
         IGenericEnumerator var4 = var1.iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               if (this.h0 < (Integer)var5.getKey()) {
                  this.n5((Integer)var5.getKey() - this.h0);
               }

               while (this.k5()) {
                  this.u3();
               }

               this.n5(((g5x$k5$n5)var5.getValue()).n5);
               Hyperlink var6 = s6h.n5(((g5x$k5$n5)var5.getValue()).l6, var3);

               while (this.k5()) {
                  g5x$l6 var7 = this.u3();
                  if (var7 != null) {
                     if (var2) {
                        var7.s7 = var6;
                     } else {
                        var7.t2 = var6;
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
   }

   private void n5(Portion var1, FieldType var2, p3f var3) {
      if (var3.e2()) {
         var1.addField(var2);
      } else if (com.aspose.slides.ms.System.d1.t2(var1.u9(), "*")) {
         String var4 = com.aspose.slides.ms.System.d1.n5;
         int var5 = var3.l6().y4().n3();
         com.aspose.slides.internal.k0r.i8 var6 = var5 > 4 ? var3.c8().h0().q0() : var3.c8().h0().t4();
         if (var6 != null) {
            if (FieldType.op_Equality(var2, FieldType.getFooter())) {
               var4 = var6.u9();
            } else if (FieldType.op_Equality(var2, FieldType.getHeader())) {
               var4 = var6.a6();
            }
         }

         var1.n5(com.aspose.slides.ms.System.d1.n5(var1.u9(), "*", var4));
      }
   }

   private boolean n5(com.aspose.slides.internal.k0r.u7f var1) {
      return !var1.y4().l6() && var1.n5() == -1 && var1.l6() == -1 && var1.k5() == -1;
   }

   private void n5(com.aspose.slides.internal.k0r.u7f var1, com.aspose.slides.internal.k0r.u7f var2) {
      var1.u9(var2.y4().k5());
      var1.n5(var2.n5());
      var1.l6(var2.l6());
      var1.k5(var2.k5());
   }

   private void n5(IPortionFormat var1, v6v var2) {
      if (var1.getLatinFont() == null) {
         var1.setLatinFont(var2.n5(65535).l6());
      }

      if (var1.getEastAsianFont() == null) {
         var1.setEastAsianFont(var2.n5(65535).l6());
      }

      if (var1.getComplexScriptFont() == null) {
         var1.setComplexScriptFont(var2.n5(65535).l6());
      }
   }
}
