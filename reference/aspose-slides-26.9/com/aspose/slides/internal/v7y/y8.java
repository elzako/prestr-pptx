package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XPathException;

public class y8 {
   private l4 n5;
   private int l6 = 0;
   private static final int[] k5 = new int[0];
   private static final int[] u3 = new int[]{3};
   private static final int[] a6 = new int[]{5};
   private static final int[] u9 = new int[]{1};
   private static final int[] h0 = new int[]{1, 1};
   private static final int[] c8 = new int[]{1, 0, 0};
   private static final int[] t2 = new int[]{1, 1, 1};
   private static final int[] s7 = new int[]{2};
   private static final int[] x8 = new int[]{0};
   private static Hashtable n3 = l6();
   private static Hashtable y4 = k5();

   private y8(l4 var1) {
      this.n5 = var1;
   }

   public static c4 n5(String var0) {
      l4 var1 = new l4(var0);
      y8 var2 = new y8(var1);
      c4 var3 = var2.n5((c4)null);
      if (var1.l6() != 69) {
         throw XPathException.create("'{0}' has an invalid token.", var1.n5());
      } else {
         return var3;
      }
   }

   public static c4 l6(String var0) {
      l4 var1 = new l4(var0);
      y8 var2 = new y8(var1);
      c4 var3 = var2.q0(null);
      if (var1.l6() != 69) {
         throw XPathException.create("'{0}' has an invalid token.", var1.n5());
      } else {
         return var3;
      }
   }

   private c4 n5(c4 var1) {
      if (++this.l6 > 200) {
         throw XPathException.create("The XPath query is too complex.");
      }

      c4 var2 = this.l6(var1);
      this.l6--;
      return var2;
   }

   private c4 l6(c4 var1) {
      c4 var2;
      for (var2 = this.k5(var1); this.k5("or"); var2 = new a3(1, var2, this.k5(var1))) {
         this.n5();
      }

      return var2;
   }

   private c4 k5(c4 var1) {
      c4 var2;
      for (var2 = this.u3(var1); this.k5("and"); var2 = new a3(2, var2, this.u3(var1))) {
         this.n5();
      }

      return var2;
   }

   private c4 u3(c4 var1) {
      c4 var2 = this.a6(var1);

      while (true) {
         int var3 = this.n5.l6() == 61 ? 3 : (this.n5.l6() == 78 ? 4 : 0);
         if (var3 == 0) {
            return var2;
         }

         this.n5();
         var2 = new a3(var3, var2, this.a6(var1));
      }
   }

   private c4 a6(c4 var1) {
      c4 var2 = this.u9(var1);

      while (true) {
         int var3 = this.n5.l6() == 60 ? 5 : (this.n5.l6() == 76 ? 6 : (this.n5.l6() == 62 ? 7 : (this.n5.l6() == 71 ? 8 : 0)));
         if (var3 == 0) {
            return var2;
         }

         this.n5();
         var2 = new a3(var3, var2, this.u9(var1));
      }
   }

   private c4 u9(c4 var1) {
      c4 var2 = this.h0(var1);

      while (true) {
         int var3 = this.n5.l6() == 43 ? 9 : (this.n5.l6() == 45 ? 10 : 0);
         if (var3 == 0) {
            return var2;
         }

         this.n5();
         var2 = new a3(var3, var2, this.h0(var1));
      }
   }

   private c4 h0(c4 var1) {
      c4 var2 = this.c8(var1);

      while (true) {
         int var3 = this.n5.l6() == 42 ? 11 : (this.k5("div") ? 12 : (this.k5("mod") ? 13 : 0));
         if (var3 == 0) {
            return var2;
         }

         this.n5();
         var2 = new a3(var3, var2, this.c8(var1));
      }
   }

   private c4 c8(c4 var1) {
      boolean var2;
      for (var2 = false; this.n5.l6() == 45; var2 = !var2) {
         this.n5();
      }

      return var2 ? new a3(11, this.t2(var1), new v0(-1.0)) : this.t2(var1);
   }

   private c4 t2(c4 var1) {
      c4 var2 = this.s7(var1);

      while (this.n5.l6() == 124) {
         this.n5();
         c4 var3 = this.s7(var1);
         this.u3(var2.l6());
         this.u3(var3.l6());
         var2 = new a3(14, var2, var3);
      }

      return var2;
   }

   private static boolean n5(l4 var0) {
      return var0.u3().length() == 0
         && ("node".equals(var0.k5()) || "text".equals(var0.k5()) || "processing-instruction".equals(var0.k5()) || "comment".equals(var0.k5()));
   }

   private c4 s7(c4 var1) {
      c4 var2;
      if (l6(this.n5)) {
         var2 = this.x8(var1);
         if (this.n5.l6() == 47) {
            this.n5();
            var2 = this.e2(var2);
         } else if (this.n5.l6() == 83) {
            this.n5();
            var2 = this.e2(new y5(5, var2));
         }
      } else {
         var2 = this.y4(null);
      }

      return var2;
   }

   private c4 x8(c4 var1) {
      c4 var2 = this.z1(var1);

      while (this.n5.l6() == 91) {
         var2 = new y9(var2, this.n3(var2));
      }

      return var2;
   }

   private c4 n3(c4 var1) {
      this.u3(var1.l6());
      this.k5(91);
      c4 var2 = this.n5(var1);
      this.k5(93);
      return var2;
   }

   private c4 y4(c4 var1) {
      if (this.n5.l6() == 47) {
         this.n5();
         c4 var2 = new j8();
         if (n5(this.n5.l6())) {
            var2 = this.e2(var2);
         }

         return var2;
      } else if (this.n5.l6() == 83) {
         this.n5();
         return this.e2(new y5(5, new j8()));
      } else {
         return this.e2(var1);
      }
   }

   private c4 e2(c4 var1) {
      c4 var2 = var1;

      while (true) {
         var2 = this.t9(var2);
         if (83 == this.n5.l6()) {
            this.n5();
            var2 = new y5(5, var2);
         } else {
            if (47 != this.n5.l6()) {
               return var2;
            }

            this.n5();
         }
      }
   }

   private static boolean n5(int var0) {
      return var0 == 46 || var0 == 68 || var0 == 64 || var0 == 97 || var0 == 42 || var0 == 110;
   }

   private c4 t9(c4 var1) {
      c4 var2;
      if (46 == this.n5.l6()) {
         this.n5();
         var2 = new y5(12, var1);
      } else if (68 == this.n5.l6()) {
         this.n5();
         var2 = new y5(9, var1);
      } else {
         int var3 = 3;
         switch (this.n5.l6()) {
            case 64:
               var3 = 2;
               this.n5();
               break;
            case 97:
               var3 = this.k5(this.n5);
               this.n5();
         }

         int var4 = var3 == 2 ? 2 : 1;
         var2 = this.n5(var1, var3, var4);

         while (91 == this.n5.l6()) {
            var2 = new y9(var2, this.n3(var2));
         }
      }

      return var2;
   }

   private c4 n5(c4 var1, int var2, int var3) {
      String var4;
      String var5;
      switch (this.n5.l6()) {
         case 42:
            var4 = com.aspose.slides.ms.System.d1.n5;
            var5 = com.aspose.slides.ms.System.d1.n5;
            this.n5();
            break;
         case 110:
            if (this.n5.h0() && n5(this.n5)) {
               var4 = com.aspose.slides.ms.System.d1.n5;
               var5 = com.aspose.slides.ms.System.d1.n5;
               var3 = "comment".equals(this.n5.k5())
                  ? 8
                  : ("text".equals(this.n5.k5()) ? 4 : ("node".equals(this.n5.k5()) ? 9 : ("processing-instruction".equals(this.n5.k5()) ? 7 : 0)));
               this.n5();
               this.k5(40);
               if (var3 == 7 && this.n5.l6() != 41) {
                  this.l6(115);
                  var5 = this.n5.a6();
                  this.n5();
               }

               this.k5(41);
            } else {
               var4 = this.n5.u3();
               var5 = this.n5.k5();
               this.n5();
               if ("*".equals(var5)) {
                  var5 = com.aspose.slides.ms.System.d1.n5;
               }
            }
            break;
         default:
            throw XPathException.create("Expression must evaluate to a node-set.", this.n5.n5());
      }

      return new y5(var2, var1, var4, var5, var3);
   }

   private static boolean l6(l4 var0) {
      return var0.l6() == 115 || var0.l6() == 100 || var0.l6() == 36 || var0.l6() == 40 || var0.l6() == 110 && var0.h0() && !n5(var0);
   }

   private c4 z1(c4 var1) {
      c4 var2 = null;
      switch (this.n5.l6()) {
         case 36:
            this.n5();
            this.l6(110);
            var2 = new g7(this.n5.k5(), this.n5.u3());
            this.n5();
            break;
         case 40:
            this.n5();
            var2 = this.n5(var1);
            if (var2.ad_() != 3) {
               var2 = new a6(var2);
            }

            this.k5(41);
            break;
         case 100:
            var2 = new v0(this.n5.u9());
            this.n5();
            break;
         case 110:
            if (this.n5.h0() && !n5(this.n5)) {
               var2 = this.t4(null);
            }
            break;
         case 115:
            var2 = new v0(this.n5.a6());
            this.n5();
      }

      return var2;
   }

   private c4 t4(c4 var1) {
      ArrayList var2 = new ArrayList();
      String var3 = this.n5.k5();
      String var4 = this.n5.u3();
      this.k5(110);
      this.k5(40);
      if (this.n5.l6() != 41) {
         while (true) {
            var2.addItem(this.n5(var1));
            if (this.n5.l6() == 41) {
               break;
            }

            this.k5(44);
         }
      }

      this.k5(41);
      if (var4.length() == 0) {
         y8$n5 var5 = (y8$n5)n3.get_Item(var3);
         if (var5 != null) {
            int var6 = var2.size();
            if (var6 < var5.l6()) {
               throw XPathException.create("Function '{0}' in '{1}' has an invalid number of arguments.", var3, this.n5.n5());
            }

            if (var5.n5() == 13) {
               for (int var9 = 0; var9 < var6; var9++) {
                  c4 var10 = (c4)var2.get_Item(var9);
                  if (var10.l6() != 1) {
                     var10 = new k5(7, var10);
                  }

                  var2.set_Item(var9, var10);
               }
            } else {
               if (var5.k5() < var6) {
                  throw XPathException.create("Function '{0}' in '{1}' has an invalid number of arguments.", var3, this.n5.n5());
               }

               if (var5.u3().length < var6) {
                  var6 = var5.u3().length;
               }

               for (int var7 = 0; var7 < var6; var7++) {
                  c4 var8 = (c4)var2.get_Item(var7);
                  if (var5.u3()[var7] != 5 && var5.u3()[var7] != var8.l6()) {
                     switch (var5.u3()[var7]) {
                        case 0:
                           var8 = new k5(9, var8);
                           break;
                        case 1:
                           var8 = new k5(7, var8);
                           break;
                        case 2:
                           var8 = new k5(8, var8);
                           break;
                        case 3:
                           if (!com.aspose.slides.internal.v6g.k5.l6(var8, g7.class)
                              && (!com.aspose.slides.internal.v6g.k5.l6(var8, k5.class) || var8.l6() != 5)) {
                              throw XPathException.create("The argument to function '{0}' in '{1}' cannot be converted to a node-set.", var3, this.n5.n5());
                           }
                     }

                     var2.set_Item(var7, var8);
                  }
               }
            }

            return new k5(var5.n5(), var2);
         }
      }

      return new k5(var4, var3, var2);
   }

   private c4 q0(c4 var1) {
      c4 var2;
      for (var2 = this.z3(var1); this.n5.l6() == 124; var2 = new a3(14, var2, this.z3(var1))) {
         this.n5();
      }

      return var2;
   }

   private c4 z3(c4 var1) {
      c4 var2 = null;
      switch (this.n5.l6()) {
         case 47:
            this.n5();
            var2 = new j8();
            if (this.n5.l6() == 69 || this.n5.l6() == 124) {
               return var2;
            }
            break;
         case 83:
            this.n5();
            var2 = new y5(5, new j8());
            break;
         case 110:
            if (this.n5.h0()) {
               var2 = this.m1(var1);
               if (var2 != null) {
                  switch (this.n5.l6()) {
                     case 47:
                        this.n5();
                        break;
                     case 83:
                        this.n5();
                        var2 = new y5(5, var2);
                        break;
                     default:
                        return var2;
                  }
               }
            }
      }

      return this.k7(var2);
   }

   private c4 m1(c4 var1) {
      ArrayList var2 = new ArrayList();
      if (this.n5.u3().length() == 0) {
         if ("id".equals(this.n5.k5())) {
            y8$n5 var3 = (y8$n5)n3.get_Item("id");
            this.n5();
            this.k5(40);
            this.l6(115);
            var2.addItem(new v0(this.n5.a6()));
            this.n5();
            this.k5(41);
            return new k5(var3.n5(), var2);
         }

         if ("key".equals(this.n5.k5())) {
            this.n5();
            this.k5(40);
            this.l6(115);
            var2.addItem(new v0(this.n5.a6()));
            this.n5();
            this.k5(44);
            this.l6(115);
            var2.addItem(new v0(this.n5.a6()));
            this.n5();
            this.k5(41);
            return new k5("", "key", var2);
         }
      }

      return null;
   }

   private c4 k7(c4 var1) {
      c4 var2 = this.m3(var1);
      if (83 == this.n5.l6()) {
         this.n5();
         var2 = this.k7(new y5(5, var2));
      } else if (47 == this.n5.l6()) {
         this.n5();
         var2 = this.k7(var2);
      }

      return var2;
   }

   private c4 m3(c4 var1) {
      int var2 = 3;
      switch (this.n5.l6()) {
         case 64:
            var2 = 2;
            this.n5();
            break;
         case 97:
            var2 = this.k5(this.n5);
            if (var2 != 3 && var2 != 2) {
               throw XPathException.create("'{0}' has an invalid token.", this.n5.n5());
            }

            this.n5();
      }

      int var3 = var2 == 2 ? 2 : 1;
      c4 var4 = this.n5(var1, var2, var3);

      while (91 == this.n5.l6()) {
         var4 = new y9(var4, this.n3(var4));
      }

      return var4;
   }

   private void l6(int var1) {
      if (this.n5.l6() != var1) {
         throw XPathException.create("'{0}' has an invalid token.", this.n5.n5());
      }
   }

   private void k5(int var1) {
      this.l6(var1);
      this.n5();
   }

   private void n5() {
      this.n5.c8();
   }

   private boolean k5(String var1) {
      return this.n5.l6() == 110 && this.n5.u3().length() == 0 && com.aspose.slides.ms.System.d1.a6(this.n5.k5(), var1);
   }

   private void u3(int var1) {
      if (var1 != 3 && var1 != 5) {
         throw XPathException.create("Expression must evaluate to a node-set.", this.n5.n5());
      }
   }

   private static Hashtable l6() {
      Hashtable var0 = new Hashtable(36);
      var0.addItem("last", new y8$n5(0, 0, 0, k5));
      var0.addItem("position", new y8$n5(1, 0, 0, k5));
      var0.addItem("name", new y8$n5(6, 0, 1, u3));
      var0.addItem("namespace-uri", new y8$n5(5, 0, 1, u3));
      var0.addItem("local-name", new y8$n5(4, 0, 1, u3));
      var0.addItem("count", new y8$n5(2, 1, 1, u3));
      var0.addItem("id", new y8$n5(3, 1, 1, a6));
      var0.addItem("string", new y8$n5(7, 0, 1, a6));
      var0.addItem("concat", new y8$n5(13, 2, 100, u9));
      var0.addItem("starts-with", new y8$n5(14, 2, 2, h0));
      var0.addItem("contains", new y8$n5(15, 2, 2, h0));
      var0.addItem("substring-before", new y8$n5(16, 2, 2, h0));
      var0.addItem("substring-after", new y8$n5(17, 2, 2, h0));
      var0.addItem("substring", new y8$n5(18, 2, 3, c8));
      var0.addItem("string-length", new y8$n5(19, 0, 1, u9));
      var0.addItem("normalize-space", new y8$n5(20, 0, 1, u9));
      var0.addItem("translate", new y8$n5(21, 3, 3, t2));
      var0.addItem("boolean", new y8$n5(8, 1, 1, a6));
      var0.addItem("not", new y8$n5(12, 1, 1, s7));
      var0.addItem("true", new y8$n5(10, 0, 0, s7));
      var0.addItem("false", new y8$n5(11, 0, 0, s7));
      var0.addItem("lang", new y8$n5(22, 1, 1, u9));
      var0.addItem("number", new y8$n5(9, 0, 1, a6));
      var0.addItem("sum", new y8$n5(23, 1, 1, u3));
      var0.addItem("floor", new y8$n5(24, 1, 1, x8));
      var0.addItem("ceiling", new y8$n5(25, 1, 1, x8));
      var0.addItem("round", new y8$n5(26, 1, 1, x8));
      return var0;
   }

   private static Hashtable k5() {
      Hashtable var0 = new Hashtable(13);
      var0.addItem("ancestor", 0);
      var0.addItem("ancestor-or-self", 1);
      var0.addItem("attribute", 2);
      var0.addItem("child", 3);
      var0.addItem("descendant", 4);
      var0.addItem("descendant-or-self", 5);
      var0.addItem("following", 6);
      var0.addItem("following-sibling", 7);
      var0.addItem("namespace", 8);
      var0.addItem("parent", 9);
      var0.addItem("preceding", 10);
      var0.addItem("preceding-sibling", 11);
      var0.addItem("self", 12);
      return var0;
   }

   private int k5(l4 var1) {
      Object var2 = y4.get_Item(var1.k5());
      if (var2 == null) {
         throw XPathException.create("'{0}' has an invalid token.", this.n5.n5());
      } else {
         return (Integer)var2;
      }
   }
}
