package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class w8s {
   private final n8n l6;
   private final String[] k5;
   private final Dictionary<String, String> u3 = new Dictionary<>();
   private final Dictionary<String, String> a6 = new Dictionary<>();
   private final Dictionary<String, a9w> u9 = new Dictionary<>();
   private final Dictionary<String, String> h0 = new Dictionary<>();
   private final Dictionary<String, String> c8 = new Dictionary<>();
   private final List<String> t2 = new List<>();
   private final Dictionary<String, Integer> s7 = new Dictionary<>();
   private final String x8;
   private final com.aspose.slides.internal.o9b.y1 n3 = new com.aspose.slides.internal.o9b.y1();
   private String[] y4;
   private int e2;
   private static final v3y t9 = new v3y("-5 0 1");
   private static final v3y z1 = new v3y("");
   private static final v3y t4 = new v3y("-5 0 1");
   private static final v1w q0 = new v1w("");
   private static final d4r z3 = new d4r("3.5cm -3.5cm 25cm");
   static final String[] n5 = new String[]{"c", "w", "h", "ss", "ls", "hc", "vc", "l", "t", "r", "b"};
   private static final com.aspose.slides.internal.n8e.e2 m1 = new com.aspose.slides.internal.n8e.e2(
      "*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val"
   );
   private static final int[] k7 = new int[]{3, 3, 3, 3, 1, 2, 3, 2, 2, 2, 3, 3, 3, 2, 1, 2, 1};
   private static final com.aspose.slides.internal.v6g.u9 m3 = new com.aspose.slides.internal.v6g.u9(
      "*", "/", "+", "-", "abs[", "sqrt[", "sin[", "cos[", "tan[", "atan[", "min[", "max[", "atan2[", "if["
   );

   public w8s(com.aspose.slides.internal.k4y.y1z var1, com.aspose.slides.internal.o9b.y1 var2, boolean var3) {
      this.x8 = var1.h0();
      var2.a6(this.n3);
      if (!com.aspose.slides.ms.System.d1.n5(this.x8) && com.aspose.slides.ms.System.d1.t2(this.x8, "?")) {
         this.k5 = new String[var1.y4().length];
      } else {
         this.k5 = new String[0];
      }

      for (int var4 = 0; var4 < this.k5.length; var4++) {
         com.aspose.slides.internal.k4y.j2l var5 = var1.y4()[var4];
         this.u3.addItem(var5.n5(), var5.l6());
         this.k5[var4] = var5.n5();
      }

      int var14 = 0;
      int var16 = 0;
      int var6 = 0;
      int var7 = 0;
      int[] var8 = new int[]{0};
      int[] var9 = new int[]{0};
      int[] var10 = new int[]{0};
      int[] var11 = new int[]{0};
      t2f.n5(var1.k5(), var8, var9, var10, var11);
      var14 = var8[0];
      var16 = var9[0];
      var6 = var10[0];
      var7 = var11[0];
      if (var3 && var2.s7() > 0.0F && var2.k5() > 0.0F) {
         int var12 = com.aspose.slides.ms.System.q1.n5(var6 - var14);
         int var13 = com.aspose.slides.ms.System.q1.n5(var7 - var16);
         if (var12 == 21600 && var13 == var12) {
            if (var2.s7() > var2.k5()) {
               var12 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var13 * var2.s7() / var2.k5()), 14);
               var6 = var14 + var12;
            } else {
               var13 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var12 * var2.k5() / var2.s7()), 14);
               var7 = var16 + var13;
            }
         }
      } else if (var6 == 0 && var7 == 0 && t2f.k5(var1.u9())) {
         var10[0] = var6;
         var11[0] = var7;
         t2f.n5(var1.u9(), var10, var11);
         var6 = var10[0];
         var7 = var11[0];
      }

      this.l6 = new n8n(var14, var16, var6, var7);
      this.y4 = new String[]{"0", "0", "w", "h"};
   }

   public final List<String> n5() {
      return this.t2;
   }

   public final Dictionary<String, String> l6() {
      return this.c8;
   }

   public final Dictionary<String, String> k5() {
      return this.a6;
   }

   public final Dictionary<String, Integer> u3() {
      return this.s7;
   }

   public final n8n a6() {
      return this.l6;
   }

   public final String[] u9() {
      return this.y4;
   }

   public final void n5(com.aspose.slides.internal.k4y.y1z var1) {
      String[] var2 = new String[]{"(", "sin[", "abs[", "sqrt[", "cos[", "tan[", "atan[", "min[", "max[", "atan2[", "if[", "*", "/", "-", "+"};
      String[] var3 = new String[]{"abs", "sqrt", "sin", "cos", "atan2", "atan", "tan", "min", "max", "if"};
      double[] var4 = this.l6.a6();
      int[] var5 = t2f.e2(var1.n3());
      double var6 = var1.c8();
      double var8 = var1.t2();
      double var10 = com.aspose.slides.ms.System.q1.n5(var4[2] - var4[0]);
      double var12 = var10 / 100.0;
      double var14 = com.aspose.slides.ms.System.q1.n5(var4[3] - var4[1]);
      double var16 = var14 / 100.0;
      double var18 = 1.0;
      double var20 = 1.0;
      List var22 = new List();
      var22.addItem(new KeyValuePair<>("left", com.aspose.slides.ms.System.q1.n5(var4[0], 0)));
      var22.addItem(new KeyValuePair<>("top", com.aspose.slides.ms.System.q1.n5(var4[1], 0)));
      var22.addItem(new KeyValuePair<>("right", com.aspose.slides.ms.System.q1.n5(var4[2], 0)));
      var22.addItem(new KeyValuePair<>("bottom", com.aspose.slides.ms.System.q1.n5(var4[3], 0)));
      var22.addItem(new KeyValuePair<>("xstretch", com.aspose.slides.ms.System.q1.n5(var6, 0)));
      var22.addItem(new KeyValuePair<>("ystretch", com.aspose.slides.ms.System.q1.n5(var8, 0)));
      var22.addItem(new KeyValuePair<>("hasstroke", var18));
      var22.addItem(new KeyValuePair<>("hasfill", var20));
      var22.addItem(new KeyValuePair<>("logwidth", com.aspose.slides.ms.System.q1.n5(var12, 0)));
      var22.addItem(new KeyValuePair<>("logheight", com.aspose.slides.ms.System.q1.n5(var16, 0)));
      var22.addItem(new KeyValuePair<>("width", com.aspose.slides.ms.System.q1.n5(var10, 0)));
      var22.addItem(new KeyValuePair<>("height", com.aspose.slides.ms.System.q1.n5(var14, 0)));
      var22.addItem(new KeyValuePair<>("pi/180", 60000.0));
      var22.addItem(new KeyValuePair<>("pi", 3.0));
      Dictionary var23 = new Dictionary<>(this.u3);
      Dictionary var24 = new Dictionary(var5.length + this.k5.length);

      for (int var25 = 0; var25 < var5.length; var25++) {
         String var26 = com.aspose.slides.ms.System.d1.n5(new String[]{"m", com.aspose.slides.ms.System.a3.l6(this.c8.size())});
         this.c8.addItem(var26, com.aspose.slides.ms.System.a3.n5(var5[var25], com.aspose.slides.internal.x7n.l6.k5()));
         var24.set_Item(com.aspose.slides.ms.System.d1.n5(new Object[]{'$', com.aspose.slides.ms.System.a3.n5(var25, com.aspose.slides.internal.x7n.l6.k5())}), var26);
      }

      this.e2 = this.k5.length;

      for (int var66 = 0; var66 < this.k5.length; var66++) {
         String var71 = this.k5[var66];
         String var27 = u3((String)var23.get_Item(var71), var3);
         var27 = n5(var27, var22);
         this.a6.addItem(var71, var27);
         this.t2.addItem(var71);
         this.n5(var71, var27, this.a6, var2, var3);
         var24.set_Item(com.aspose.slides.ms.System.d1.n5(new String[]{"?", var71}), var71);
         this.h0.addItem(var71, var71);
      }

      if (this.a6.size() > 0) {
         com.aspose.slides.internal.l7h.a5 var72 = new com.aspose.slides.internal.l7h.a5();
         Dictionary$Enumerator var75 = var24.iterator();

         try {
            while (var75.hasNext()) {
               KeyValuePair var28 = (KeyValuePair)var75.next();
               String var29 = com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.internal.r7c.c8.a6((String)var28.getKey()), "\\b"});
               if (var72.l6() > 0) {
                  var72.n5('|');
               }

               var72.n5(var29);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var75, IDisposable.class)) {
               var75.dispose();
            }
         }

         com.aspose.slides.internal.r7c.c8 var78 = new com.aspose.slides.internal.r7c.c8(var72.toString());
         w8s$1 var80 = new w8s$1(this, var24);
         List$Enumerator var30 = new List<>(this.a6.getKeys()).iterator();

         try {
            while (var30.hasNext()) {
               String var31 = (String)var30.next();
               String var32 = this.a6.get_Item(var31);
               var32 = var78.n5(var32, var80);
               this.a6.set_Item(var31, n5(var32, var2));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
               var30.dispose();
            }
         }
      }

      List$Enumerator var73 = new List<>(this.c8.getKeys()).iterator();

      try {
         while (var73.hasNext()) {
            String var76 = (String)var73.next();
            this.c8.set_Item(var76, n5(this.c8.get_Item(var76), var2));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var73, IDisposable.class)) {
            var73.dispose();
         }
      }

      List var77 = new List<>(this.t2);

      for (int var67 = 0; var67 < var77.size(); var67++) {
         this.n5(this.a6, (String)var77.get_Item(var67));
      }

      int var68 = 0;
      Dictionary$Enumerator var79 = this.c8.iterator();

      try {
         while (var79.hasNext()) {
            KeyValuePair var81 = (KeyValuePair)var79.next();
            this.s7.addItem((String)var81.getKey(), ++var68);
            this.u9.set_Item((String)var81.getKey(), new a9w(this.n5((String)var81.getValue()), null));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var79, IDisposable.class)) {
            var79.dispose();
         }
      }

      var68 = 1;

      for (String var93 : n5) {
         this.s7.addItem(var93, -(var68++));
      }

      for (int var70 = 0; var70 < this.t2.size(); var70++) {
         this.s7.addItem(this.t2.get_Item(var70), -(12 + var70));
         String var83 = this.n5().get_Item(var70);
         String var86 = this.a6.get_Item(var83);
         String var89 = null;
         String[] var94 = new String[]{var89};
         this.h0.tryGetValue(var83, var94);
         var89 = var94[0];
         double var36 = this.n5(var86);
         this.u9.set_Item(var83, new a9w(var36, var89));
      }

      if (t2f.k5(var1.s7())) {
         String[] var84 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var1.s7(), "?", ""), ' ');
         if (var84.length > 3 && var10 > 0.0 && var14 > 0.0) {
            for (String var33 : var84) {
               if ((var33.charAt(0) < '0' || var33.charAt(0) > '9') && !this.u9.containsKey(var33)) {
                  return;
               }
            }

            double var38 = 1.0;
            double var40 = 1.0;
            if (var10 > 0.0) {
               var38 = this.n3.s7() * 12700.0F / var10;
            }

            if (var14 > 0.0) {
               var40 = this.n3.k5() * 12700.0F / var14;
            }

            String var42 = var84[0];
            boolean var43 = var42.charAt(0) < '0' || var42.charAt(0) > '9';
            double var44 = var43 && this.u9.containsKey(var42) ? this.u9.get_Item(var42).n5() : com.aspose.slides.ms.System.z3.u3(var42);
            this.y4[0] = com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var44 * var38, 14));
            var42 = var84[1];
            var43 = var42.charAt(0) < '0' || var42.charAt(0) > '9';
            var44 = var43 && this.u9.containsKey(var42) ? this.u9.get_Item(var42).n5() : com.aspose.slides.ms.System.z3.u3(var42);
            this.y4[1] = com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var44 * var40, 14));
            var42 = var84[2];
            var43 = var42.charAt(0) < '0' || var42.charAt(0) > '9';
            var44 = var43 && this.u9.containsKey(var42) ? this.u9.get_Item(var42).n5() : com.aspose.slides.ms.System.z3.u3(var42);
            this.y4[2] = com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var44 * var38, 14));
            var42 = var84[3];
            var43 = var42.charAt(0) < '0' || var42.charAt(0) > '9';
            var44 = var43 && this.u9.containsKey(var42) ? this.u9.get_Item(var42).n5() : com.aspose.slides.ms.System.z3.u3(var42);
            this.y4[3] = com.aspose.slides.ms.System.a3.l6(com.aspose.slides.internal.v6g.k5.u3(var44 * var40, 14));
         }
      }
   }

   public final Dictionary<String, Double> h0() {
      Dictionary var1 = new Dictionary();
      Dictionary$Enumerator var2 = this.u9.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!com.aspose.slides.ms.System.d1.n5(((a9w)var3.getValue()).l6())) {
               var1.addItem(((a9w)var3.getValue()).l6(), ((a9w)var3.getValue()).n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   static String n5(String var0, String[] var1) {
      var0 = com.aspose.slides.ms.System.d1.l6(var0);
      Dictionary var2 = new Dictionary();
      var2.addItem("*", "*/");
      var2.addItem("/", "*/");
      var2.addItem("+", "+-");
      var2.addItem("-", "+-");
      var2.addItem("abs[", "abs");
      var2.addItem("sqrt[", "sqrt");
      var2.addItem("sin[", "sin");
      var2.addItem("cos[", "cos");
      var2.addItem("tan[", "tan");
      var2.addItem("atan[", "at2");
      var2.addItem("min[", "min");
      var2.addItem("max[", "max");
      var2.addItem("atan2[", "at2");
      var2.addItem("if[", "?:");
      int var3 = -1;
      String var4 = "";
      int var5 = -1;

      for (int var6 = 1; var6 < var1.length; var6++) {
         var5 = com.aspose.slides.ms.System.d1.c8(var0, var1[var6]);
         if (var5 > -1) {
            var3 = var6;
            switch (m3.n5(var1[var3])) {
               case 0:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 0, var5)),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, var5 + 1, var0.length() - var5 - 1)),
                     " 1"
                  });
                  break;
               case 1:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 0, var5)),
                     " 1 ",
                     com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, var5 + 1, var0.length() - var5 - 1))
                  });
                  break;
               case 2:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 0, var5)),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, var5 + 1, var0.length() - var5 - 1)),
                     " 0"
                  });
                  break;
               case 3:
                  if (var5 == 0) {
                     int var7 = com.aspose.slides.ms.System.d1.c8(com.aspose.slides.ms.System.d1.k5(var0, 1), var1[var6]);
                     if (var7 > -1) {
                        var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                           (String)var2.get_Item(var1[var3]),
                           " ",
                           com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 0, var7 + 1)),
                           " 0 ",
                           com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, var7 + 2, var0.length() - var7 - 2))
                        });
                     } else if (!"f".equals(com.aspose.slides.ms.System.d1.l6(var0, 1, 1)) && !"m".equals(com.aspose.slides.ms.System.d1.l6(var0, 1, 1))) {
                        var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"val ", com.aspose.slides.ms.System.d1.l6(var0)});
                     } else {
                        var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                           (String)var2.get_Item(var1[var3]),
                           " ",
                           "0 0 ",
                           com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, var5 + 1, var0.length() - var5 - 1))
                        });
                     }
                  } else {
                     var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                        (String)var2.get_Item(var1[var3]),
                        " ",
                        com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 0, var5)),
                        " 0 ",
                        com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, var5 + 1, var0.length() - var5 - 1))
                     });
                  }
                  break;
               case 4:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]), " ", com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 4, var0.length() - 5))
                  });
                  break;
               case 5:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]), " ", com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 5, var0.length() - 6))
                  });
                  break;
               case 6:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]), " 1 ", com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 4, var0.length() - 5))
                  });
                  break;
               case 7:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]), " 1 ", com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 4, var0.length() - 5))
                  });
                  break;
               case 8:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]), " 1 ", com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 4, var0.length() - 5))
                  });
                  break;
               case 9:
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(var0, 4, var0.length() - 6)),
                     " 1"
                  });
                  break;
               case 10:
               case 11:
                  String[] var12 = com.aspose.slides.ms.System.d1.n5(
                     com.aspose.slides.ms.System.d1.n5(
                        com.aspose.slides.ms.System.d1.n5(var0, 0, 4), com.aspose.slides.ms.System.d1.n5(var0, 0, 4).length() - 1, 1
                     ),
                     ','
                  );
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]), " ", com.aspose.slides.ms.System.d1.l6(var12[0]), " ", com.aspose.slides.ms.System.d1.l6(var12[1])
                  });
                  break;
               case 12:
                  String[] var11 = com.aspose.slides.ms.System.d1.n5(
                     com.aspose.slides.ms.System.d1.n5(
                        com.aspose.slides.ms.System.d1.n5(var0, 0, 6), com.aspose.slides.ms.System.d1.n5(var0, 0, 6).length() - 1, 1
                     ),
                     ','
                  );
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]), " ", com.aspose.slides.ms.System.d1.l6(var11[0]), " ", com.aspose.slides.ms.System.d1.l6(var11[1])
                  });
                  break;
               case 13:
                  String[] var8 = com.aspose.slides.ms.System.d1.n5(
                     com.aspose.slides.ms.System.d1.n5(
                        com.aspose.slides.ms.System.d1.n5(var0, 0, 3), com.aspose.slides.ms.System.d1.n5(var0, 0, 3).length() - 1, 1
                     ),
                     ','
                  );
                  var4 = com.aspose.slides.ms.System.d1.n5(new String[]{
                     (String)var2.get_Item(var1[var3]),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(var8[0]),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(var8[1]),
                     " ",
                     com.aspose.slides.ms.System.d1.l6(var8[2])
                  });
            }
         }
      }

      if (var3 == -1) {
         var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"val ", com.aspose.slides.ms.System.d1.l6(var0)});
      }

      return var4;
   }

   static String n5(String var0, List<KeyValuePair<String, Double>> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var0 = com.aspose.slides.ms.System.d1.n5(
               var0, (String)var3.getKey(), com.aspose.slides.ms.System.d2.n5((Double)var3.getValue(), com.aspose.slides.internal.x7n.l6.k5())
            );
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var0;
   }

   static boolean l6(String var0, String[] var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (com.aspose.slides.ms.System.d1.c8(var0, var1[var3]) > -1) {
            var2++;
         }

         if (var2 > 1) {
            return true;
         }
      }

      return false;
   }

   static int k5(String var0, String[] var1) {
      int var2 = var1.length + 1;
      int var3 = var0.length();

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = com.aspose.slides.ms.System.d1.c8(var0, var1[var4]);
         if (var5 < var3 && var5 > -1 && var4 < var2) {
            var3 = var5;
            var2 = var4;
         }
      }

      return var2;
   }

   final void n5(String var1, String var2, Dictionary<String, String> var3, String[] var4, String[] var5) {
      String var6 = "";
      String var7 = "";
      if (l6(var2, var4)) {
         int var8 = k5(var2, var4);
         int var9 = com.aspose.slides.ms.System.d1.c8(var2, var4[var8]);
         if ("(".equals(var4[var8])) {
            int var25 = n5(var2, var9, '(', ')');
            var6 = com.aspose.slides.ms.System.d1.n5("f", com.aspose.slides.ms.System.a3.l6(this.e2++));
            var7 = com.aspose.slides.ms.System.d1.l6(var2, var9 + 1, var25 - var9 - 1);
            this.t2.addItem(var6);
            var3.set_Item(var6, var7);
            String var27 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var2, var9, var25 - var9 + 1), var9, var6);
            var3.set_Item(var1, var27);
            this.n5(var1, var27, var3, var4, var5);
            this.n5(var6, var7, var3, var4, var5);
            return;
         }

         if (com.aspose.slides.ms.System.u3.n5(var5, com.aspose.slides.ms.System.d1.l6(var4[var8], 0, var4[var8].length() - 1)) > -1) {
            int var24 = var9 + var4[var8].length() - 1;
            int var26 = n5(var2, var24, '[', ']');
            String var28 = com.aspose.slides.ms.System.d1.l6(var2, var24 + 1, var26 - var24 - 1);
            String[] var13 = com.aspose.slides.ms.System.d1.n5(var28, ',');
            String var14 = "";

            for (int var15 = 0; var15 < var13.length; var15++) {
               var6 = com.aspose.slides.ms.System.d1.n5("f", com.aspose.slides.ms.System.a3.l6(this.e2++));
               var7 = var13[var15];
               var14 = com.aspose.slides.ms.System.d1.n5(var14, com.aspose.slides.ms.System.d1.n5(new String[]{var6, ","}));
               this.t2.addItem(var6);
               var3.set_Item(var6, var7);
               this.n5(var6, var7, var3, var4, var5);
            }

            var14 = com.aspose.slides.ms.System.d1.l6(var14, 0, var14.length() - 1);
            var6 = com.aspose.slides.ms.System.d1.n5("f", com.aspose.slides.ms.System.a3.l6(this.e2++));
            var7 = com.aspose.slides.ms.System.d1.n5(new String[]{var4[var8], var14, "]"});
            this.t2.addItem(var6);
            var3.set_Item(var6, var7);
            this.n5(var6, var7, var3, var4, var5);
            String var30 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.n5(var2, var9, var26 - var9 + 1), var9, var6);
            var3.set_Item(var1, var30);
            this.n5(var1, var30, var3, var4, var5);
            return;
         }

         int var10 = n5(var9, var2, var4);
         int var11 = l6(var9, var2, var4);
         var6 = com.aspose.slides.ms.System.d1.n5("f", com.aspose.slides.ms.System.a3.l6(this.e2++));
         var7 = com.aspose.slides.ms.System.d1.l6(var2, var10 == -1 ? 0 : var10 + 1, var11 - var10 - 1);
         this.t2.addItem(var6);
         var3.set_Item(var6, var7);
         String var12 = com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.ms.System.d1.n5(var2, var10 == -1 ? 0 : var10 + 1, var11 - var10 - 1), var10 + 1, var6
         );
         var3.set_Item(var1, var12);
         this.n5(var1, var12, var3, var4, var5);
         this.n5(var6, var7, var3, var4, var5);
      }
   }

   static int n5(int var0, String var1, String[] var2) {
      int var3 = -1;
      byte var4 = -1;

      for (int var5 = 0; var5 < var2.length; var5++) {
         int var6 = com.aspose.slides.ms.System.d1.c8(var1, var2[var5]);
         if (var6 > -1 && var6 > var3 && var6 < var0) {
            var3 = var6;
         }
      }

      return var3;
   }

   static int l6(int var0, String var1, String[] var2) {
      int var3 = var1.length();
      byte var4 = -1;

      for (int var5 = 0; var5 < var2.length; var5++) {
         int var6 = com.aspose.slides.ms.System.d1.c8(var1, var2[var5]);
         if (var6 > -1 && var6 < var3 && var6 > var0) {
            var3 = var6;
         }
      }

      return var3;
   }

   static String u3(String var0, String[] var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(var0);

      for (int var3 = 0; var3 < var1.length; var3++) {
         int var4 = com.aspose.slides.ms.System.d1.c8(var0, com.aspose.slides.ms.System.d1.n5(new Object[]{var1[var3], '('}));
         int var5 = var4 + var1[var3].length();
         if (var4 > -1) {
            int var6 = n5(var0, var5, '(', ')');
            var2.n5(var5, '[');
            var2.n5(var6, ']');
         }

         var0 = var2.toString();
      }

      return var0;
   }

   static int n5(String var0, int var1, char var2, char var3) {
      int var4 = 0;

      for (int var5 = var1 + 1; var5 < var0.length(); var5++) {
         if (var0.charAt(var5) == var2) {
            var4++;
         }

         if (var0.charAt(var5) == var3) {
            if (var4 == 0) {
               return var5;
            }

            var4--;
         }
      }

      return 0;
   }

   final double n5(String var1) {
      int var2 = 0;
      int var3 = var1.length();

      while (var2 < var3 && var1.charAt(var2) != ' ') {
         var2++;
      }

      int var4 = m1.n5(com.aspose.slides.ms.System.d1.l6(var1, 0, var2));
      byte var5 = (byte)var4;
      int var6 = k7[var4];
      String[] var7 = com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.k5(var1, var2)), ' ');
      double var8 = this.l6(var7[0]);
      double var10;
      double var12;
      if (var6 > 1) {
         var10 = this.l6(var7[1]);
         if (var6 > 2 && var7.length > 2) {
            var12 = this.l6(var7[2]);
         } else {
            var12 = 0.0;
         }
      } else {
         var12 = 0.0;
         var10 = 0.0;
      }

      double var14 = 0.0;
      switch (var5) {
         case 0:
            if (var12 == 0.0) {
               var12 = 1.0;
            }

            var14 = var8 * var10 / var12;
            break;
         case 1:
            var14 = var8 + var10 - var12;
         case 2:
         case 6:
         case 10:
         case 11:
         case 12:
         default:
            break;
         case 3:
            if (var8 > 0.0) {
               var14 = var10;
            } else {
               var14 = var12;
            }
            break;
         case 4:
            var14 = com.aspose.slides.ms.System.q1.n5(var8);
            break;
         case 5:
            var14 = com.aspose.slides.ms.System.q1.u3(var10, var8);
            break;
         case 7:
            var14 = var8 * com.aspose.slides.ms.System.q1.c8(var10);
            break;
         case 8:
            var14 = com.aspose.slides.ms.System.q1.l6(var8, var10);
            break;
         case 9:
            var14 = com.aspose.slides.ms.System.q1.k5(var8, var10);
            break;
         case 13:
            var14 = var8 * com.aspose.slides.ms.System.q1.h0(var10);
            break;
         case 14:
            var14 = com.aspose.slides.ms.System.q1.z3(com.aspose.slides.ms.System.q1.n5(var8));
            break;
         case 15:
            var14 = var8 * com.aspose.slides.ms.System.q1.t2(var10);
            break;
         case 16:
            var14 = var8;
      }

      return var14;
   }

   final void n5(Dictionary<String, String> var1, String var2) {
      int var3 = -1;
      int var4 = -1;
      String[] var5 = com.aspose.slides.ms.System.d1.n5((String)var1.get_Item(var2), ' ');
      var3 = this.t2.indexOf(var2);

      for (int var6 = 1; var6 < var5.length; var6++) {
         if (this.t2.indexOf(var5[var6]) > -1) {
            var4 = this.t2.indexOf(var5[var6]);
            if (var4 > var3) {
               this.t2.removeAt(var4);
               this.t2.insertItem(var3, var5[var6]);
               this.n5(var1, var5[var6]);
            }
         }
      }
   }

   final double l6(String var1) {
      if ("".equals(var1)) {
         return 9.223372E18F;
      }

      int var2 = 0;
      int var3 = var1.length();

      while (var2 < var3 && var1.charAt(var2) == ' ') {
         var2++;
      }

      byte var5 = 1;
      if (var1.charAt(var2) == '-') {
         var2++;
         var5 = -1;

         while (var2 < var3 && var1.charAt(var2) == ' ') {
            var2++;
         }
      } else if (var1.charAt(var2) == '+') {
         var2++;

         while (var2 < var3 && var1.charAt(var2) == ' ') {
            var2++;
         }
      }

      long var6 = 0L;

      while (var2 < var3) {
         char var8 = var1.charAt(var2);
         if (var8 < '0' || var8 > '9') {
            return this.u9.get_Item(var1).n5();
         }

         var6 = var6 * 10L + (var8 - '0');
         var2++;
      }

      return (double)var5 * var6;
   }

   public static String k5(String var0) {
      return com.aspose.slides.ms.System.d1.l6(var0, "?") ? com.aspose.slides.ms.System.d1.l6(var0, 1, var0.length() - 1) : var0;
   }
}
