package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k3i extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private int c8;
   private String t2;
   private int s7;
   private String x8;
   private List<g7> n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "name",
      "axis",
      "ptType",
      "hideLastTrans",
      "st",
      "cnt",
      "step",
      "func",
      "arg",
      "op",
      "val",
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

   public k3i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      k3i$1 var2 = new k3i$1(this);
      n5(var1, var2);
      n5(var1, new k3i$2(this, var1));
   }

   public k3i() {
      this.y4();
   }

   private void y4() {
      this.n5 = "";
      this.l6 = "none";
      this.k5 = "all";
      this.u3 = "true";
      this.a6 = "1";
      this.u9 = "0";
      this.h0 = "1";
      this.c8 = 0;
      this.t2 = "none";
      this.s7 = 0;
      this.n3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      if (!"none".equals(this.l6)) {
         var2.l6("axis", this.l6);
      }

      if (!"all".equals(this.k5)) {
         var2.l6("ptType", this.k5);
      }

      if (!"true".equals(this.u3)) {
         var2.l6("hideLastTrans", this.u3);
      }

      if (!"1".equals(this.a6)) {
         var2.l6("st", this.a6);
      }

      if (!"0".equals(this.u9)) {
         var2.l6("cnt", this.u9);
      }

      if (!"1".equals(this.h0)) {
         var2.l6("step", this.h0);
      }

      var2.l6("func", z7o.n5(this.c8));
      if (!"none".equals(this.t2)) {
         var2.l6("arg", this.t2);
      }

      var2.l6("op", s7b.n5(this.s7));
      var2.l6("val", this.x8);
      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (y4.n5(var5.n5())) {
               case 11:
                  ((p5i)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 12:
                  ((r6v)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 13:
                  ((d4w)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 14:
                  ((n8z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 15:
                  ((k5r)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 16:
                  ((c5z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 17:
                  ((y5g)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 18:
                  ((i9l)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 19:
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
      return this.l6;
   }

   public final String l6() {
      return this.k5;
   }

   public final String k5() {
      return this.u3;
   }

   public final String u3() {
      return this.a6;
   }

   public final String a6() {
      return this.u9;
   }

   public final String u9() {
      return this.h0;
   }

   public final int h0() {
      return this.c8;
   }

   public final String c8() {
      return this.t2;
   }

   public final int t2() {
      return this.s7;
   }

   public final String s7() {
      return this.x8;
   }

   public final List<g7> x8() {
      return this.n3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return y4;
   }

   // $VF: synthetic method
   static String n5(k3i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(k3i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(k3i var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(k3i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(k3i var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(k3i var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(k3i var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int n5(k3i var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(k3i var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int l6(k3i var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String t2(k3i var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(k3i var0) {
      return var0.n3;
   }
}
