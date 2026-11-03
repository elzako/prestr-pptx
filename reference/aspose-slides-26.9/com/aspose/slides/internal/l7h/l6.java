package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

public abstract class l6 extends r4 {
   protected int n5;
   protected int l6 = 0;
   protected char[] k5;
   protected char[] u3;
   private static byte[] s7 = new byte[44];
   protected static com.aspose.slides.internal.z0k.t4 a6 = l6("codepages.nlp");
   protected static final Object u9 = new Object();
   protected byte[] h0 = new byte[48];
   protected int c8;
   protected int t2;

   public l6(int var1, int var2) {
      super(var1, new f2(null), new s3(null));
      this.a0();
      this.n5 = var2;
      this.d2();
   }

   public l6(int var1, int var2, q0 var3, t2 var4) {
      super(var1, var3, var4);
      this.n5 = var2;
      this.d2();
   }

   private void a0() {
      com.aspose.slides.internal.v6g.k5.n5(this.x8(), f2.class).n5 = this;
      com.aspose.slides.internal.v6g.k5.n5(this.n3(), s3.class).n5 = this;
   }

   public static com.aspose.slides.internal.z0k.t4 l6(String var0) {
      com.aspose.slides.internal.z0k.t4 var1 = com.aspose.slides.internal.z0k.t4.fromJava(l6.class.getResourceAsStream(var0));
      if (var1 == null) {
         throw new InvalidOperationException();
      }

      var1.read(s7, 0, s7.length);
      return var1;
   }

   private void d2() {
      if (!this.a6(this.n5)) {
         throw new NotSupportedException(
            o0.n5(
               "No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.",
               this.t9()
            )
         );
      }

      this.u3();
   }

   private boolean a6(int var1) {
      byte[] var2 = new byte[40];
      synchronized (u9) {
         a6.seek(44L, 0);
         int var4 = com.aspose.slides.ms.System.x8.u3(s7, 40);

         for (int var5 = 0; var5 < var4; var5++) {
            a6.read(var2, 0, var2.length);
            int var6 = com.aspose.slides.ms.System.x8.u3(var2, 32);
            if (var6 == var1) {
               long var7 = a6.getPosition();
               int var9 = com.aspose.slides.ms.System.x8.a6(var2, 36);
               a6.seek(var9, 0);
               a6.read(this.h0, 0, this.h0.length);
               this.c8 = (int)a6.getPosition();
               if (var5 == var4 - 1) {
                  this.t2 = (int)(a6.getLength() - var9 - this.h0.length);
               } else {
                  a6.seek(var7, 0);
                  a6.read(var2, 0, var2.length);
                  this.t2 = com.aspose.slides.ms.System.x8.a6(var2, 36) - var9 - this.h0.length;
               }

               return true;
            }
         }

         return false;
      }
   }

   public static int k5(int var0) {
      byte[] var1 = new byte[40];
      synchronized (u9) {
         a6.seek(44L, 0);
         int var3 = com.aspose.slides.ms.System.x8.u3(s7, 40);

         for (int var4 = 0; var4 < var3; var4++) {
            a6.read(var1, 0, var1.length);
            if (com.aspose.slides.ms.System.x8.u3(var1, 32) == var0) {
               return com.aspose.slides.ms.System.x8.u3(var1, 34);
            }
         }

         return 0;
      }
   }

   protected abstract void u3();

   protected abstract void a6();
}
