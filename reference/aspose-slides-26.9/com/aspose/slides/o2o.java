package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

class o2o {
   private static final Dictionary<Character, Character> n5 = new Dictionary<>();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "mrow",
      "mstyle",
      "mfrac",
      "msup",
      "msub",
      "msubsup",
      "msqrt",
      "mroot",
      "mover",
      "munder",
      "munderover",
      "menclose",
      "mfenced",
      "left",
      "top",
      "bottom",
      "right",
      "updiagonalstrike",
      "downdiagonalstrike",
      "verticalstrike",
      "horizontalstrike"
   );

   public o2o() {
   }

   public final MathBlock n5(com.aspose.slides.internal.h6.n5 var1) {
      return this.l6(var1);
   }

   private MathBlock l6(com.aspose.slides.internal.h6.n5 var1) {
      MathBlock var2 = new MathBlock();
      IGenericEnumerator var3 = var1.y1().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var3.next();
            com.aspose.slides.internal.h6.n5 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.h6.n5.class);
            if (var5 != null) {
               IMathElement var6 = this.k5(var5);
               if (var6 != null) {
                  var2.join(var6);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private IMathElement k5(com.aspose.slides.internal.h6.n5 var1) {
      switch (l6.n5(var1.t2())) {
         case 0:
         case 1:
            if (var1.y1().n5() > 0) {
               return new MathBox(this.l6(var1));
            }
            break;
         case 2:
            List var15 = this.u3(var1);
            if (var15.size() > 1) {
               return new MathFraction(
                  this.k5((com.aspose.slides.internal.h6.n5)var15.get_Item(0)), this.k5((com.aspose.slides.internal.h6.n5)var15.get_Item(1))
               );
            }
            break;
         case 3:
            List var14 = this.u3(var1);
            if (var14.size() > 1) {
               return new MathSuperscriptElement(
                  this.k5((com.aspose.slides.internal.h6.n5)var14.get_Item(0)), this.k5((com.aspose.slides.internal.h6.n5)var14.get_Item(1))
               );
            }
            break;
         case 4:
            List var13 = this.u3(var1);
            if (var13.size() > 1) {
               return new MathSubscriptElement(
                  this.k5((com.aspose.slides.internal.h6.n5)var13.get_Item(0)), this.k5((com.aspose.slides.internal.h6.n5)var13.get_Item(1))
               );
            }
            break;
         case 5:
            List var12 = this.u3(var1);
            if (var12.size() > 2) {
               return new MathRightSubSuperscriptElement(
                  this.k5((com.aspose.slides.internal.h6.n5)var12.get_Item(0)),
                  this.k5((com.aspose.slides.internal.h6.n5)var12.get_Item(1)),
                  this.k5((com.aspose.slides.internal.h6.n5)var12.get_Item(2))
               );
            }
            break;
         case 6:
            List var11 = this.u3(var1);
            if (var11.size() > 0) {
               IMathElement var18 = this.k5((com.aspose.slides.internal.h6.n5)var11.get_Item(0));
               if (var11.size() > 1) {
                  MathBlock var4 = new MathBlock(var18);

                  for (int var5 = 1; var5 < var11.size(); var5++) {
                     var4.add(this.k5((com.aspose.slides.internal.h6.n5)var11.get_Item(var5)));
                  }

                  var18 = var4;
               }

               MathRadical var19 = new MathRadical(var18, null);
               var19.setHideDegree(true);
               return var19;
            }
            break;
         case 7:
            List var10 = this.u3(var1);
            if (var10.size() > 1) {
               return new MathRadical(
                  this.k5((com.aspose.slides.internal.h6.n5)var10.get_Item(0)), this.k5((com.aspose.slides.internal.h6.n5)var10.get_Item(1))
               );
            }
            break;
         case 8:
            List var9 = this.u3(var1);
            if (var9.size() > 1) {
               return this.n5(var9, true);
            }
            break;
         case 9:
            List var8 = this.u3(var1);
            if (var8.size() > 1) {
               return this.n5(var8, false);
            }
            break;
         case 10:
            List var7 = this.u3(var1);
            if (var7.size() > 2) {
               MathLimit var17 = new MathLimit(
                  this.k5((com.aspose.slides.internal.h6.n5)var7.get_Item(0)), this.k5((com.aspose.slides.internal.h6.n5)var7.get_Item(1))
               );
               return var17.setUpperLimit(this.k5((com.aspose.slides.internal.h6.n5)var7.get_Item(2)));
            }
            break;
         case 11:
            List var6 = this.u3(var1);
            if (var6.size() > 0) {
               return this.n5(var6, var1.u3("notation"));
            }
            break;
         case 12:
            List var2 = this.u3(var1);
            if (var2.size() > 0) {
               return this.n5(var2, var1);
            }
            break;
         default:
            String var3 = var1.e5();
            if (!com.aspose.slides.ms.System.d1.n5(var3)) {
               var3 = com.aspose.slides.internal.h3r.n5.n5(var3);
               return new MathematicalText(var3);
            }
      }

      return null;
   }

   private List<com.aspose.slides.internal.h6.n5> u3(com.aspose.slides.internal.h6.n5 var1) {
      List var2 = new List();
      IGenericEnumerator var3 = var1.y1().iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.j3.z8 var4 = (com.aspose.slides.internal.j3.z8)var3.next();
            com.aspose.slides.internal.h6.n5 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.h6.n5.class);
            if (var5 != null) {
               var2.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   private IMathElement n5(List<com.aspose.slides.internal.h6.n5> var1, boolean var2) {
      com.aspose.slides.internal.h6.n5 var3 = (com.aspose.slides.internal.h6.n5)var1.get_Item(1);
      if ("mo".equals(var3.t2())) {
         String var4 = com.aspose.slides.internal.h3r.n5.n5(((com.aspose.slides.internal.h6.n5)var1.get_Item(1)).e5());
         if (!com.aspose.slides.ms.System.d1.n5(var4) && var4.length() == 1) {
            if (!var2) {
               return new MathGroupingCharacter(this.k5((com.aspose.slides.internal.h6.n5)var1.get_Item(0)), var4.charAt(0), 2, 1);
            }

            char var5 = '\u0000';
            Character[] var6 = new Character[]{var5};
            boolean var7 = !n5.tryGetValue(var4.charAt(0), var6);
            var5 = var6[0];
            if (var7) {
               var5 = var4.charAt(0);
            }

            try {
               return new MathAccent(this.k5((com.aspose.slides.internal.h6.n5)var1.get_Item(0)), var5);
            } catch (ArgumentOutOfRangeException var9) {
               return new MathGroupingCharacter(this.k5((com.aspose.slides.internal.h6.n5)var1.get_Item(0)), var5, 1, 2);
            }
         }
      }

      return new MathLimit(this.k5((com.aspose.slides.internal.h6.n5)var1.get_Item(0)), this.k5((com.aspose.slides.internal.h6.n5)var1.get_Item(1)), var2);
   }

   private IMathElement n5(List<com.aspose.slides.internal.h6.n5> var1, String var2) {
      MathBorderBox var3 = new MathBorderBox(this.k5((com.aspose.slides.internal.h6.n5)var1.get_Item(0)));
      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         boolean var4 = true;
         boolean var5 = true;
         boolean var6 = true;
         boolean var7 = true;
         String[] var8 = com.aspose.slides.ms.System.d1.n5(var2, new char[]{' '}, (short)1);

         for (String var12 : var8) {
            switch (l6.n5(com.aspose.slides.ms.System.d1.a6(var12))) {
               case 13:
                  var4 = false;
                  break;
               case 14:
                  var6 = false;
                  break;
               case 15:
                  var7 = false;
                  break;
               case 16:
                  var5 = false;
                  break;
               case 17:
                  var3.setStrikethroughBottomLeftToTopRight(true);
                  break;
               case 18:
                  var3.setStrikethroughTopLeftToBottomRight(true);
                  break;
               case 19:
                  var3.setStrikethroughVertical(true);
                  break;
               case 20:
                  var3.setStrikethroughHorizontal(true);
            }
         }

         var3.setHideLeft(var4);
         var3.setHideRight(var5);
         var3.setHideTop(var6);
         var3.setHideBottom(var7);
      }

      return var3;
   }

   private IMathElement n5(List<com.aspose.slides.internal.h6.n5> var1, com.aspose.slides.internal.h6.n5 var2) {
      MathDelimiter var3 = new MathDelimiter(this.k5((com.aspose.slides.internal.h6.n5)var1.get_Item(0)));
      String var4 = var2.u3("open");
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         var3.setBeginningCharacter(com.aspose.slides.ms.System.d1.k5(var4).charAt(0));
      }

      String var5 = var2.u3("close");
      if (!com.aspose.slides.ms.System.d1.n5(var5)) {
         var3.setEndingCharacter(com.aspose.slides.ms.System.d1.k5(var5).charAt(0));
      }

      String var6 = var2.u3("separators");
      if (!com.aspose.slides.ms.System.d1.n5(var6)) {
         var3.setSeparatorCharacter(com.aspose.slides.ms.System.d1.k5(var6).charAt(0));
      } else {
         var3.setSeparatorCharacter('\u0000');
      }

      return var3;
   }

   static {
      n5.addItem('←', '⃖');
      n5.addItem('→', '⃗');
      n5.addItem('↔', '⃡');
      n5.addItem('↼', '⃐');
      n5.addItem('⇀', '⃑');
   }
}
