package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

class x8 extends com.aspose.slides.internal.v6g.h0<x8> {
   static final String[] n5 = new String[]{"r", "ddd, dd'-'MMM'-'yyyy HH':'mm':'ss 'GMT'", "ddd, dd'-'MMM'-'yy HH':'mm':'ss 'GMT'"};
   String l6;
   int k5;
   private int a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "COMMENT",
      "COMMENTURL",
      "DISCARD",
      "DOMAIN",
      "HTTPONLY",
      "MAX-AGE",
      "EXPIRES",
      "PATH",
      "PORT",
      "SECURE",
      "VERSION",
      "mon",
      "tue",
      "wed",
      "thu",
      "fri",
      "sat",
      "sun",
      "monday",
      "tuesday",
      "wednesday",
      "thursday",
      "friday",
      "saturday",
      "sunday"
   );
   // $VF: synthetic field
   static final boolean u3 = !x8.class.desiredAssertionStatus();

   public x8() {
   }

   public x8(String var1) {
      this.l6 = var1;
      this.k5 = var1.length();
      this.a6 = 0;
   }

   public IGenericEnumerable<h0> n5() {
      List var1 = new List();

      while (this.a6 < this.k5) {
         h0 var2;
         try {
            var2 = this.k5();
         } catch (RuntimeException var4) {
            while (this.a6 < this.k5 && this.l6.charAt(this.a6) != ',') {
               this.a6++;
            }

            this.a6++;
            continue;
         }

         var1.add(var2);
      }

      return var1;
   }

   private h0 k5() {
      String var1 = this.u3();
      if (this.a6 >= this.k5) {
         return new h0(var1, com.aspose.slides.ms.System.d1.n5);
      }

      String var2 = com.aspose.slides.ms.System.d1.n5;
      if (this.l6.charAt(this.a6) == '=') {
         this.a6++;
         var2 = this.a6();
      }

      h0 var3 = new h0(var1, var2);
      if (this.a6 >= this.k5) {
         return var3;
      }

      if (this.l6.charAt(this.a6) == ',') {
         this.a6++;
         return var3;
      }

      if (this.l6.charAt(this.a6++) == ';' && this.a6 < this.k5) {
         while (this.a6 < this.k5) {
            String var4 = this.u3();
            String var5 = com.aspose.slides.ms.System.d1.n5;
            if (this.a6 < this.k5 && this.l6.charAt(this.a6) == '=') {
               this.a6++;
               var5 = this.a6();
            }

            this.n5(var3, var4, var5);
            if (this.a6 >= this.k5) {
               break;
            }

            if (this.l6.charAt(this.a6) == ',') {
               this.a6++;
               break;
            }

            if (this.l6.charAt(this.a6) != ';') {
               break;
            }

            this.a6++;
         }

         return var3;
      } else {
         return var3;
      }
   }

   private void n5(h0 var1, String var2, String var3) {
      if (var2 != null && !com.aspose.slides.ms.System.d1.a6(var2, com.aspose.slides.ms.System.d1.n5)) {
         switch (u9.n5(com.aspose.slides.ms.System.d1.s7(var2))) {
            case 0:
               if (var1.n5() == null) {
                  var1.n5(var3);
               }
               break;
            case 1:
               if (var1.l6() == null) {
                  var1.n5(new com.aspose.slides.ms.System.r8(var3));
               }
               break;
            case 2:
               var1.n5(true);
               break;
            case 3:
               if ("".equals(var1.u3())) {
                  var1.l6(var3);
               }
               break;
            case 4:
               var1.k5(true);
               break;
            case 5:
               if (com.aspose.slides.ms.System.j5.h0(var1.h0(), com.aspose.slides.ms.System.j5.l6)) {
                  try {
                     var1.n5(var1.e2().a6(com.aspose.slides.internal.v6g.k5.t2(com.aspose.slides.ms.System.l4.n5(var3), 10)).m3());
                  } catch (RuntimeException var6) {
                  }
               }
               break;
            case 6:
               if (!com.aspose.slides.ms.System.j5.c8(var1.h0(), com.aspose.slides.ms.System.j5.l6)) {
                  if (this.a6 < this.k5 && this.l6.charAt(this.a6) == ',' && n5(var3)) {
                     this.a6++;
                     var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var3, ", ", this.a6()});
                  }

                  var1.n5(l6(var3).m3());
               }
               break;
            case 7:
               var1.u3(var3);
               break;
            case 8:
               if (var1.x8() == null) {
                  var1.a6(var3);
               }
               break;
            case 9:
               var1.u3(true);
               break;
            case 10:
               try {
                  var1.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.l4.n5(var3), 10));
               } catch (RuntimeException var5) {
               }
         }
      } else {
         throw new InvalidOperationException();
      }
   }

   private String u3() {
      int var1 = this.a6;

      while (var1 < this.k5 && com.aspose.slides.ms.System.t9.t9(this.l6.charAt(var1))) {
         var1++;
      }

      int var2 = var1;

      while (var1 < this.k5 && this.l6.charAt(var1) != ';' && this.l6.charAt(var1) != ',' && this.l6.charAt(var1) != '=') {
         var1++;
      }

      this.a6 = var1;
      return com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(this.l6, var2, var1 - var2));
   }

   private String a6() {
      if (this.a6 >= this.k5) {
         return null;
      }

      int var1 = this.a6;

      while (var1 < this.k5 && com.aspose.slides.ms.System.t9.t9(this.l6.charAt(var1))) {
         var1++;
      }

      int var2;
      if (this.l6.charAt(var1) == '"') {
         var2 = var1++;

         while (var1 < this.k5 && this.l6.charAt(var1) != '"') {
            var1++;
         }

         int var3 = ++var1;

         while (var3 < this.k5 && this.l6.charAt(var3) != ';' && this.l6.charAt(var3) != ',') {
            var3++;
         }

         this.a6 = var3;
      } else {
         var2 = var1;

         while (var1 < this.k5 && this.l6.charAt(var1) != ';' && this.l6.charAt(var1) != ',') {
            var1++;
         }

         this.a6 = var1;
      }

      return com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.l6(this.l6, var2, var1 - var2));
   }

   static boolean n5(String var0) {
      switch (u9.n5(com.aspose.slides.ms.System.d1.a6(var0))) {
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
            return true;
         default:
            return false;
      }
   }

   static com.aspose.slides.ms.System.j5 l6(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return com.aspose.slides.ms.System.j5.l6.m3();
      }

      for (int var1 = 0; var1 < com.aspose.slides.ms.System.u3.n5((Object)(n5)).a6(); var1++) {
         try {
            com.aspose.slides.ms.System.j5 var2 = com.aspose.slides.ms.System.j5.n5(var0, n5[var1], com.aspose.slides.internal.x7n.l6.k5()).m3();
            com.aspose.slides.ms.System.j5.n5(var2.m3(), 1L).u3(var2);
            return var2.m3().q0();
         } catch (RuntimeException var3) {
         }
      }

      return com.aspose.slides.ms.System.j5.l6.m3();
   }

   public void n5(x8 var1) {
      var1 = var1 == null ? new x8() : var1;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.a6 = this.a6;
   }

   public x8 l6() {
      x8 var1 = new x8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(x8 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6) && var1.k5 == this.k5 && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof x8) ? false : this.l6((x8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x8 Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(x8 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
