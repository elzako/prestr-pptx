package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c5z extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private List<g7> t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "name",
      "ref",
      "axis",
      "ptType",
      "hideLastTrans",
      "st",
      "cnt",
      "step",
      "alg",
      "shape",
      "presOf",
      "constrLst",
      "ruleLst",
      "forEach",
      "layoutNode",
      "choose",
      "extLst"
   );

   public c5z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      c5z$1 var2 = new c5z$1(this);
      n5(var1, var2);
      n5(var1, new c5z$2(this, var1));
   }

   public c5z() {
      this.x8();
   }

   private void x8() {
      this.n5 = "";
      this.l6 = "";
      this.k5 = "none";
      this.u3 = "all";
      this.a6 = "true";
      this.u9 = "1";
      this.h0 = "0";
      this.c8 = "1";
      this.t2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      if (!"".equals(this.l6)) {
         var2.l6("ref", this.l6);
      }

      if (!"none".equals(this.k5)) {
         var2.l6("axis", this.k5);
      }

      if (!"all".equals(this.u3)) {
         var2.l6("ptType", this.u3);
      }

      if (!"true".equals(this.a6)) {
         var2.l6("hideLastTrans", this.a6);
      }

      if (!"1".equals(this.u9)) {
         var2.l6("st", this.u9);
      }

      if (!"0".equals(this.h0)) {
         var2.l6("cnt", this.h0);
      }

      if (!"1".equals(this.c8)) {
         var2.l6("step", this.c8);
      }

      List$Enumerator var4 = this.t2.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (s7.n5(var5.n5())) {
               case 8:
                  ((p5i)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 9:
                  ((r6v)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 10:
                  ((d4w)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 11:
                  ((n8z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 12:
                  ((k5r)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 13:
                  ((c5z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 14:
                  ((y5g)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 15:
                  ((i9l)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 16:
                  ((l8r)var5.k5()).n5("dgm", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final String a6() {
      return this.a6;
   }

   public final String u9() {
      return this.u9;
   }

   public final String h0() {
      return this.h0;
   }

   public final String c8() {
      return this.c8;
   }

   public final List<g7> t2() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(c5z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(c5z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(c5z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(c5z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(c5z var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(c5z var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(c5z var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String c8(c5z var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static List n5(c5z var0) {
      return var0.t2;
   }
}
