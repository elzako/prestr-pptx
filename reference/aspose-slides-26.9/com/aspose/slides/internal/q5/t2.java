package com.aspose.slides.internal.q5;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.ms.System.d1;

public class t2 extends com.aspose.slides.internal.l7.u9 {
   private t2(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.h0 var2) {
      super(var1, var2);
   }

   public final int a6() {
      return this.n5.a6(2);
   }

   private int u9() {
      return this.n5.a6(4);
   }

   private static int h0(int var0) {
      return 6 + var0 * 12;
   }

   public final int n5(int var1) {
      return this.n5.a6(0 + h0(var1));
   }

   public final int l6(int var1) {
      return this.n5.a6(2 + h0(var1));
   }

   public final int k5(int var1) {
      return this.n5.a6(4 + h0(var1));
   }

   public final int u3(int var1) {
      return this.n5.a6(6 + h0(var1));
   }

   private int c8(int var1) {
      return this.n5.a6(8 + h0(var1));
   }

   private int t2(int var1) {
      return this.n5.a6(10 + h0(var1)) + this.u9();
   }

   public final byte[] a6(int var1) {
      int var2 = this.c8(var1);
      byte[] var3 = new byte[var2];
      this.n5.n5(this.t2(var1), var3, 0, var2);
      return var3;
   }

   public final byte[] n5(int var1, int var2, int var3, int var4) {
      t2$k5 var5 = this.l6(var1, var2, var3, var4);
      return var5 != null ? var5.k5() : null;
   }

   public final t2$k5 u9(int var1) {
      return new t2$k5(this.n5(var1), this.l6(var1), this.k5(var1), this.u3(var1), this.a6(var1));
   }

   public final t2$k5 l6(int var1, int var2, int var3, int var4) {
      com.aspose.slides.internal.q9.l6 var5 = this.n5(new t2$a6(var1, var2, var3, var4));
      return var5.n5() ? (t2$k5)var5.l6() : null;
   }

   public final com.aspose.slides.internal.q9.l6 n5(t2$l6 var1) {
      return new t2$h0(var1, this);
   }

   private static String n5(int var0, int var1) {
      String var2 = null;
      switch (var0) {
         case 0:
            var2 = "UTF-16BE";
            break;
         case 1:
            switch (var1) {
               case 0:
                  var2 = "MacRoman";
                  break;
               case 1:
                  var2 = "Shift_JIS";
                  break;
               case 2:
                  var2 = "Big5";
                  break;
               case 3:
                  var2 = "EUC-KR";
                  break;
               case 4:
                  var2 = "MacArabic";
                  break;
               case 5:
                  var2 = "MacHebrew";
                  break;
               case 6:
                  var2 = "MacGreek";
                  break;
               case 7:
                  var2 = "MacCyrillic";
                  break;
               case 8:
                  var2 = "MacSymbol";
               case 9:
               case 10:
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
               case 22:
               case 24:
               case 26:
               case 28:
               case 30:
               case 31:
               case 32:
               default:
                  break;
               case 21:
                  var2 = "MacThai";
                  break;
               case 23:
                  var2 = "MacCyrillic";
                  break;
               case 25:
                  var2 = "EUC-CN";
                  break;
               case 27:
                  var2 = "MacCyrillic";
                  break;
               case 29:
                  var2 = "MacCyrillic";
            }
         case 2:
         case 4:
         default:
            break;
         case 3:
            switch (var1) {
               case 0:
                  var2 = "UTF-16BE";
                  break;
               case 1:
                  var2 = "UTF-16BE";
                  break;
               case 2:
                  var2 = "windows-933";
                  break;
               case 3:
                  var2 = "windows-936";
                  break;
               case 4:
                  var2 = "windows-950";
                  break;
               case 5:
                  var2 = "windows-949";
                  break;
               case 6:
                  var2 = "ms1361";
               case 7:
               case 8:
               case 9:
               default:
                  break;
               case 10:
                  var2 = "UCS-4";
            }
      }

      return var2;
   }

   private static String l6(byte[] var0, int var1, int var2) {
      String var3 = n5(var1, var2);
      j5 var4 = com.aspose.slides.internal.n2d.x8.n5(d1.u9(var3));
      return var4.l6(var0);
   }

   // $VF: synthetic method
   static String n5(byte[] var0, int var1, int var2) {
      return l6(var0, var1, var2);
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;Lcom/aspose/slides/internal/q5/t2$1;)V -> (Lcom/aspose/slides/internal/l7/u3;Lcom/aspose/slides/internal/m9/h0;)V
   t2(com.aspose.slides.internal.l7.u3 recoveredArg0, com.aspose.slides.internal.m9.h0 recoveredArg1, com.aspose.slides.internal.q5.t2$1 recoveredArg2) {
      this(recoveredArg0, recoveredArg1);
   }
}
