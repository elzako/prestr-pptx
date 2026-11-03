package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k5v extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "w:customXml",
      "w:smartTag",
      "w:sdt",
      "w:r",
      "w:proofErr",
      "w:permStart",
      "w:permEnd",
      "w:bookmarkStart",
      "w:bookmarkEnd",
      "w:moveFromRangeStart",
      "w:moveFromRangeEnd",
      "w:moveToRangeStart",
      "w:moveToRangeEnd",
      "w:commentRangeStart",
      "w:commentRangeEnd",
      "w:customXmlInsRangeStart",
      "w:customXmlInsRangeEnd",
      "w:customXmlDelRangeStart",
      "w:customXmlDelRangeEnd",
      "w:customXmlMoveFromRangeStart",
      "w:customXmlMoveFromRangeEnd",
      "w:customXmlMoveToRangeStart",
      "w:customXmlMoveToRangeEnd",
      "w:ins",
      "w:del",
      "w:moveFrom",
      "w:moveTo",
      "m:oMathPara",
      "m:oMath",
      "m:acc",
      "m:bar",
      "m:box",
      "m:borderBox",
      "m:d",
      "m:eqArr",
      "m:f",
      "m:func",
      "m:groupChr",
      "m:limLow",
      "m:limUpp",
      "m:m",
      "m:nary",
      "m:phant",
      "m:rad",
      "m:sPre",
      "m:sSub",
      "m:sSubSup",
      "m:sSup",
      "m:r"
   );

   public k5v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n5();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (l6.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.e2(), ":", var1.n3()}))) {
                  case 0:
                     w8r var4 = new w8r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXml"}), var4));
                     break;
                  case 1:
                     w0a var5 = new w0a(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "smartTag"}), var5));
                     break;
                  case 2:
                     j2a var6 = new j2a(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "sdt"}), var6));
                     break;
                  case 3:
                     z4t var7 = new z4t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "r"}), var7));
                     break;
                  case 4:
                     n4r var8 = new n4r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "proofErr"}), var8));
                     break;
                  case 5:
                     f3y var9 = new f3y(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "permStart"}), var9));
                     break;
                  case 6:
                     t9r var10 = new t9r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "permEnd"}), var10));
                     break;
                  case 7:
                     s2c var11 = new s2c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "bookmarkStart"}), var11));
                     break;
                  case 8:
                     j3l var12 = new j3l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "bookmarkEnd"}), var12));
                     break;
                  case 9:
                     f3g var13 = new f3g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "moveFromRangeStart"}), var13));
                     break;
                  case 10:
                     j3l var14 = new j3l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "moveFromRangeEnd"}), var14));
                     break;
                  case 11:
                     f3g var15 = new f3g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "moveToRangeStart"}), var15));
                     break;
                  case 12:
                     j3l var16 = new j3l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "moveToRangeEnd"}), var16));
                     break;
                  case 13:
                     j3l var17 = new j3l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "commentRangeStart"}), var17));
                     break;
                  case 14:
                     j3l var18 = new j3l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "commentRangeEnd"}), var18));
                     break;
                  case 15:
                     v8s var19 = new v8s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlInsRangeStart"}), var19));
                     break;
                  case 16:
                     h1g var20 = new h1g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlInsRangeEnd"}), var20));
                     break;
                  case 17:
                     v8s var21 = new v8s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlDelRangeStart"}), var21));
                     break;
                  case 18:
                     h1g var22 = new h1g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlDelRangeEnd"}), var22));
                     break;
                  case 19:
                     v8s var23 = new v8s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlMoveFromRangeStart"}), var23));
                     break;
                  case 20:
                     h1g var24 = new h1g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlMoveFromRangeEnd"}), var24));
                     break;
                  case 21:
                     v8s var25 = new v8s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlMoveToRangeStart"}), var25));
                     break;
                  case 22:
                     h1g var26 = new h1g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "customXmlMoveToRangeEnd"}), var26));
                     break;
                  case 23:
                     k5v var27 = new k5v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "ins"}), var27));
                     break;
                  case 24:
                     k5v var28 = new k5v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "del"}), var28));
                     break;
                  case 25:
                     k5v var29 = new k5v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "moveFrom"}), var29));
                     break;
                  case 26:
                     k5v var30 = new k5v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "moveTo"}), var30));
                     break;
                  case 27:
                     m1r var31 = new m1r(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "oMathPara"}), var31));
                     break;
                  case 28:
                     o3d var32 = new o3d(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "oMath"}), var32));
                     break;
                  case 29:
                     b3x var33 = new b3x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "acc"}), var33));
                     break;
                  case 30:
                     q7l var34 = new q7l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "bar"}), var34));
                     break;
                  case 31:
                     r3m var35 = new r3m(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "box"}), var35));
                     break;
                  case 32:
                     r2v var36 = new r2v(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "borderBox"}), var36));
                     break;
                  case 33:
                     w7k var37 = new w7k(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "d"}), var37));
                     break;
                  case 34:
                     m1j var38 = new m1j(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "eqArr"}), var38));
                     break;
                  case 35:
                     k6l var39 = new k6l(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "f"}), var39));
                     break;
                  case 36:
                     i3t var40 = new i3t(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "func"}), var40));
                     break;
                  case 37:
                     h9j var41 = new h9j(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "groupChr"}), var41));
                     break;
                  case 38:
                     b9g var42 = new b9g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "limLow"}), var42));
                     break;
                  case 39:
                     m6c var43 = new m6c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "limUpp"}), var43));
                     break;
                  case 40:
                     e8a var44 = new e8a(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "m"}), var44));
                     break;
                  case 41:
                     x6g var45 = new x6g(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "nary"}), var45));
                     break;
                  case 42:
                     d2m var46 = new d2m(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "phant"}), var46));
                     break;
                  case 43:
                     o9p var47 = new o9p(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "rad"}), var47));
                     break;
                  case 44:
                     f7s var48 = new f7s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "sPre"}), var48));
                     break;
                  case 45:
                     x3s var49 = new x3s(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "sSub"}), var49));
                     break;
                  case 46:
                     a6c var50 = new a6c(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "sSubSup"}), var50));
                     break;
                  case 47:
                     t8f var51 = new t8f(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "sSup"}), var51));
                     break;
                  case 48:
                     e8x var52 = new e8x(var1);
                     this.n5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "r"}), var52));
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public k5v() {
      this.n5();
   }

   private void n5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((w8r)var5.k5()).n5("w", var2, "customXml");
                  break;
               case 1:
                  ((w0a)var5.k5()).n5("w", var2, "smartTag");
                  break;
               case 2:
                  ((j2a)var5.k5()).n5("w", var2, "sdt");
                  break;
               case 3:
                  ((z4t)var5.k5()).n5("w", var2, "r");
                  break;
               case 4:
                  ((n4r)var5.k5()).n5("w", var2, "proofErr");
                  break;
               case 5:
                  ((f3y)var5.k5()).n5("w", var2, "permStart");
                  break;
               case 6:
                  ((t9r)var5.k5()).n5("w", var2, "permEnd");
                  break;
               case 7:
                  ((s2c)var5.k5()).n5("w", var2, "bookmarkStart");
                  break;
               case 8:
                  ((j3l)var5.k5()).n5("w", var2, "bookmarkEnd");
                  break;
               case 9:
                  ((f3g)var5.k5()).n5("w", var2, "moveFromRangeStart");
                  break;
               case 10:
                  ((j3l)var5.k5()).n5("w", var2, "moveFromRangeEnd");
                  break;
               case 11:
                  ((f3g)var5.k5()).n5("w", var2, "moveToRangeStart");
                  break;
               case 12:
                  ((j3l)var5.k5()).n5("w", var2, "moveToRangeEnd");
                  break;
               case 13:
                  ((j3l)var5.k5()).n5("w", var2, "commentRangeStart");
                  break;
               case 14:
                  ((j3l)var5.k5()).n5("w", var2, "commentRangeEnd");
                  break;
               case 15:
                  ((v8s)var5.k5()).n5("w", var2, "customXmlInsRangeStart");
                  break;
               case 16:
                  ((h1g)var5.k5()).n5("w", var2, "customXmlInsRangeEnd");
                  break;
               case 17:
                  ((v8s)var5.k5()).n5("w", var2, "customXmlDelRangeStart");
                  break;
               case 18:
                  ((h1g)var5.k5()).n5("w", var2, "customXmlDelRangeEnd");
                  break;
               case 19:
                  ((v8s)var5.k5()).n5("w", var2, "customXmlMoveFromRangeStart");
                  break;
               case 20:
                  ((h1g)var5.k5()).n5("w", var2, "customXmlMoveFromRangeEnd");
                  break;
               case 21:
                  ((v8s)var5.k5()).n5("w", var2, "customXmlMoveToRangeStart");
                  break;
               case 22:
                  ((h1g)var5.k5()).n5("w", var2, "customXmlMoveToRangeEnd");
                  break;
               case 23:
                  ((k5v)var5.k5()).n5("w", var2, "ins");
                  break;
               case 24:
                  ((k5v)var5.k5()).n5("w", var2, "del");
                  break;
               case 25:
                  ((k5v)var5.k5()).n5("w", var2, "moveFrom");
                  break;
               case 26:
                  ((k5v)var5.k5()).n5("w", var2, "moveTo");
                  break;
               case 27:
                  ((m1r)var5.k5()).n5("m", var2, "oMathPara");
                  break;
               case 28:
                  ((o3d)var5.k5()).n5("m", var2, "oMath");
                  break;
               case 29:
                  ((b3x)var5.k5()).n5("m", var2, "acc");
                  break;
               case 30:
                  ((q7l)var5.k5()).n5("m", var2, "bar");
                  break;
               case 31:
                  ((r3m)var5.k5()).n5("m", var2, "box");
                  break;
               case 32:
                  ((r2v)var5.k5()).n5("m", var2, "borderBox");
                  break;
               case 33:
                  ((w7k)var5.k5()).n5("m", var2, "d");
                  break;
               case 34:
                  ((m1j)var5.k5()).n5("m", var2, "eqArr");
                  break;
               case 35:
                  ((k6l)var5.k5()).n5("m", var2, "f");
                  break;
               case 36:
                  ((i3t)var5.k5()).n5("m", var2, "func");
                  break;
               case 37:
                  ((h9j)var5.k5()).n5("m", var2, "groupChr");
                  break;
               case 38:
                  ((b9g)var5.k5()).n5("m", var2, "limLow");
                  break;
               case 39:
                  ((m6c)var5.k5()).n5("m", var2, "limUpp");
                  break;
               case 40:
                  ((e8a)var5.k5()).n5("m", var2, "m");
                  break;
               case 41:
                  ((x6g)var5.k5()).n5("m", var2, "nary");
                  break;
               case 42:
                  ((d2m)var5.k5()).n5("m", var2, "phant");
                  break;
               case 43:
                  ((o9p)var5.k5()).n5("m", var2, "rad");
                  break;
               case 44:
                  ((f7s)var5.k5()).n5("m", var2, "sPre");
                  break;
               case 45:
                  ((x3s)var5.k5()).n5("m", var2, "sSub");
                  break;
               case 46:
                  ((a6c)var5.k5()).n5("m", var2, "sSubSup");
                  break;
               case 47:
                  ((t8f)var5.k5()).n5("m", var2, "sSup");
                  break;
               case 48:
                  ((e8x)var5.k5()).n5("m", var2, "r");
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }
}
