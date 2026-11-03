package com.aspose.slides.internal.i4;

public class u8 extends u6 {
   private final j9 u3;
   private static final char[] a6 = new char[]{
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9',
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
      'G',
      'H',
      'I',
      'J',
      'K',
      'L',
      'M',
      'N',
      'O',
      'P',
      'Q',
      'R',
      'S',
      'T',
      'U',
      'V',
      'W',
      'X',
      'Y',
      'Z'
   };

   public final g7 n5(g7 var1, g7[] var2) {
      if (var1 == this.n5("NaN")) {
         return this.u3.c4().u9("NaN");
      }

      if (var1 == this.n5("NEGATIVE_INFINITY")) {
         return this.u3.c4().u9("-Infinity");
      }

      if (var1 == this.n5("POSITIVE_INFINITY")) {
         return this.u3.c4().u9("Infinity");
      }

      int var3 = 10;
      if (var2.length > 0 && var2[0] != l5.n5) {
         var3 = com.aspose.slides.internal.v6g.k5.u3(var2[0].l6(), 14);
      }

      long var4 = com.aspose.slides.internal.v6g.k5.u9(var1.l6(), 14);
      if (var3 == 10) {
         return this.u3.c4().u9(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d2.n5(var1.l6(), com.aspose.slides.internal.x7n.l6.k5())));
      }

      long var6 = com.aspose.slides.ms.System.q1.n5(var4);
      int var8 = 0;
      char[] var9 = new char[63];

      for (var8 = 0; var8 <= 64 && var6 != 0L; var8++) {
         var9[var9.length - var8 - 1] = a6[(int)(var6 % var3)];
         var6 /= var3;
      }

      if (var4 < 0L) {
         var9[var9.length - var8++ - 1] = '-';
      }

      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.n5(var9, var9.length - var8, var8)));
   }

   public final g7 l6(g7 var1, g7[] var2) {
      return this.n5(var1, new g7[0]);
   }

   public final g7 k5(g7 var1, g7[] var2) {
      int var3 = 0;
      if (var2.length > 0) {
         var3 = com.aspose.slides.ms.System.z3.h0(var2[0].l6());
      }

      if (var3 > 20 || var3 < 0) {
         throw new n1(this.u3.k7().u9("Fraction Digits must be greater than 0 and lesser than 20"));
      } else {
         return var1 == this.u3.y2()
            ? this.u3.c4().u9(var1.toString())
            : this.u3
               .c4()
               .u9(
                  com.aspose.slides.ms.System.d2.n5(
                     var1.l6(), com.aspose.slides.ms.System.d1.n5(new String[]{"f", com.aspose.slides.ms.System.a3.l6(var3)}), com.aspose.slides.internal.x7n.l6.k5()
                  )
               );
      }
   }

   public final g7 u3(g7 var1, g7[] var2) {
      if (!com.aspose.slides.ms.System.d2.l6(var1.l6()) && !com.aspose.slides.ms.System.d2.k5(var1.l6())) {
         int var3 = 16;
         if (var2.length > 0) {
            var3 = com.aspose.slides.ms.System.z3.h0(var2[0].l6());
         }

         if (var3 <= 20 && var3 >= 0) {
            String var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"#.", com.aspose.slides.ms.System.d1.n5('0', var3), "e+0"});
            return this.u3.c4().u9(com.aspose.slides.ms.System.d2.n5(var1.l6(), var4, com.aspose.slides.internal.x7n.l6.k5()));
         } else {
            throw new n1(this.u3.k7().u9("Fraction Digits must be greater than 0 and lesser than 20"));
         }
      } else {
         return this.n5(var1, new g7[0]);
      }
   }

   public final g7 a6(g7 var1, g7[] var2) {
      if (com.aspose.slides.ms.System.d2.l6(var1.l6()) || com.aspose.slides.ms.System.d2.k5(var1.l6())) {
         return this.n5(var1, new g7[0]);
      }

      if (var2.length == 0) {
         throw new n1(this.u3.k7().u9("precision missing"));
      }

      if (var2[0] == l5.n5) {
         return this.n5(var1, new g7[0]);
      }

      int var3 = 0;
      if (var2.length > 0) {
         var3 = com.aspose.slides.ms.System.z3.h0(var2[0].l6());
      }

      if (var3 >= 1 && var3 <= 21) {
         String var4 = com.aspose.slides.ms.System.d2.n5(var1.l6(), "e23", com.aspose.slides.internal.x7n.l6.k5());
         int var5 = com.aspose.slides.ms.System.d1.n5(var4, new char[]{'.', 'e'});
         var5 = var5 == -1 ? var4.length() : var5;
         var3 -= var5;
         var3 = var3 < 1 ? 1 : var3;
         return this.u3
            .c4()
            .u9(
               com.aspose.slides.ms.System.d2.n5(
                  var1.l6(), com.aspose.slides.ms.System.d1.n5(new String[]{"e", com.aspose.slides.ms.System.a3.l6(var3)}), com.aspose.slides.internal.x7n.l6.k5()
               )
            );
      } else {
         throw new n1(this.u3.z3().u9("precision must be between 1 and 21"));
      }
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("toString".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("toLocaleString".equals(this.n5)) {
         var4 = this.l6(var2, var3);
      } else if ("toFixed".equals(this.n5)) {
         var4 = this.k5(var2, var3);
      } else if ("toExponential".equals(this.n5)) {
         var4 = this.u3(var2, var3);
      } else {
         if (!"toPrecision".equals(this.n5)) {
            throw new j3("unknown error function");
         }

         var4 = this.a6(var2, var3);
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public u8(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }
}
