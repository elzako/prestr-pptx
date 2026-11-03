package com.aspose.slides.internal.p6w;

import com.aspose.slides.Collections.Queue;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.g8v.e5;
import com.aspose.slides.internal.g8v.i1;
import com.aspose.slides.internal.g8v.t1;
import com.aspose.slides.internal.g8v.w2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;
import com.aspose.slides.ms.System.z7;

public class h0 implements IDisposable {
   private com.aspose.slides.internal.s0c.n5 k5;
   private int u3;
   private int a6;
   private int u9;
   boolean n5 = true;
   private Queue h0 = new Queue(2);
   private Queue c8 = new Queue(2);
   private static int t2 = -1;
   private static int s7 = -1;
   private boolean x8 = false;
   private boolean n3;
   boolean l6;
   private static Object y4 = null;
   private static y8 e2 = null;

   private com.aspose.slides.internal.s0c.n5 n5(int var1, int var2, int var3, int[] var4) {
      return com.aspose.slides.internal.s0c.l6.n5(var1, var2, var3, var4);
   }

   public h0(int var1, int var2, int var3) {
      this.u3 = var1;
      this.a6 = var2;
      this.u9 = var3;
      int var4 = 0;
      int[] var5 = new int[]{0};
      this.k5 = this.n5(var1, var2, var3, var5);
      var4 = var5[0];
      if (var4 != 0) {
         throw new q0(var4);
      }
   }

   private void n5(com.aspose.slides.internal.s0c.n5 var1, boolean var2, int[] var3) {
      var1.n5(var2, var3);
   }

   public boolean n5() {
      return this.n5;
   }

   public void n5(boolean var1) {
      this.s7();
      int var2 = 0;
      int[] var3 = new int[]{0};
      this.n5(this.k5, var1, var3);
      var2 = var3[0];
      if (var2 != 0) {
         throw new q0(var2);
      }

      this.n5 = var1;
   }

   public boolean l6() {
      return this.x8;
   }

   public int k5() {
      return this.a6;
   }

   public static boolean u3() {
      u9();
      return t2 == 1;
   }

   public static boolean a6() {
      u9();
      return s7 == 1;
   }

   public static void u9() {
      if (t2 == -1) {
         try {
            h0 var0 = new h0(2, 1, 6);
            var0.h0();
            t2 = 1;
         } catch (RuntimeException var3) {
            t2 = 0;
         }
      }

      if (s7 == -1) {
         Object var4 = null;
         if (var4 != null) {
            s7 = ((t1)var4).n5 ? -1 : 0;
         }

         if (s7 != 0) {
            try {
               h0 var1 = new h0(23, 1, 6);
               var1.h0();
               s7 = 1;
            } catch (RuntimeException var2) {
            }
         }
      }
   }

   public z7 n5(byte[] var1, int var2, int var3, int var4, com.aspose.slides.ms.System.h0 var5, Object var6) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 >= 0 && var2 <= com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6()) {
         if (var3 >= 0 && var2 + var3 <= com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6()) {
            synchronized (this.h0) {
               h0$l6 var8 = new h0$l6(this, var6, var5, 2);
               var8.u3 = var1;
               var8.a6 = var2;
               var8.u9 = var3;
               var8.h0 = var4;
               this.h0.enqueue(var8);
               if (this.h0.size() == 1) {
                  h0$k5 var9 = new h0$k5(var8);
                  c8 var10 = new c8(this, var9);
                  var10.n5(null, var8);
               }

               return var8;
            }
         } else {
            throw new ArgumentOutOfRangeException("size");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset");
      }
   }

   public z7 l6(byte[] var1, int var2, int var3, int var4, com.aspose.slides.ms.System.h0 var5, Object var6) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("offset must be >= 0");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("size must be >= 0");
      }

      if (var2 + var3 > com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6()) {
         throw new ArgumentOutOfRangeException("offset + size exceeds the buffer length");
      }

      synchronized (this.c8) {
         h0$l6 var8 = new h0$l6(this, var6, var5, 4);
         var8.u3 = var1;
         var8.a6 = var2;
         var8.u9 = var3;
         var8.h0 = var4;
         this.c8.enqueue(var8);
         if (this.c8.size() == 1) {
            h0$k5 var9 = new h0$k5(var8);
            t2 var10 = new t2(this, var9);
            var10.n5(null, var8);
         }

         return var8;
      }
   }

   private void n5(com.aspose.slides.internal.s0c.n5 var1, com.aspose.slides.internal.g8v.q0 var2, int[] var3) {
      var1.n5(var2, var3);
   }

   public void n5(com.aspose.slides.internal.g8v.q0 var1) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("local_end");
      }

      int var2 = 0;
      int[] var3 = new int[]{0};
      this.n5(this.k5, var1, var3);
      var2 = var3[0];
      if (var2 != 0) {
         throw new q0(var2);
      }
   }

   private void n5(com.aspose.slides.internal.s0c.n5 var1, int[] var2) {
      var1.n5(var2);
   }

   public void h0() {
      this.dispose();
   }

   private void l6(com.aspose.slides.internal.s0c.n5 var1, com.aspose.slides.internal.g8v.q0 var2, int[] var3) {
      var1.l6(var2, var3);
   }

   public void l6(com.aspose.slides.internal.g8v.q0 var1) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("remoteEP");
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, e5.class)) {
         e5 var2 = (e5)var1;
         if (var2.u3().equals(i1.n5) || var2.u3().equals(i1.a6)) {
            throw new q0(10049);
         }
      }

      int var4 = 0;
      int[] var3 = new int[]{0};
      this.l6(this.k5, var1, var3);
      var4 = var3[0];
      if (var4 != 0) {
         throw new q0(var4);
      }

      this.x8 = true;
   }

   public int n5(z7 var1) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("result");
      }

      h0$l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0$l6.class);
      if (var2 == null) {
         throw new ArgumentException("Invalid IAsyncResult", "result");
      }

      if (!var1.k5()) {
         var1.l6().a6();
      }

      var2.u3();
      return var2.u9();
   }

   public int l6(z7 var1) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("result");
      }

      h0$l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, h0$l6.class);
      if (var2 == null) {
         throw new ArgumentException("Invalid IAsyncResult", "result");
      }

      if (!var1.k5()) {
         var1.l6().a6();
      }

      var2.u3();
      return var2.u9();
   }

   public int n5(long var1, byte[] var3, byte[] var4) {
      throw new NotImplementedException();
   }

   private boolean n5(com.aspose.slides.internal.s0c.n5 var1, int var2, int var3, int[] var4) {
      return var1.n5(var2, var3, this, var4);
   }

   public boolean n5(int var1, int var2) {
      this.s7();
      if (var2 != 0 && var2 != 1 && var2 != 2) {
         throw new NotSupportedException("'mode' parameter is not valid.");
      }

      int var3 = 0;
      int[] var4 = new int[]{0};
      boolean var5 = this.n5(this.k5, var2, var1, var4);
      var3 = var4[0];
      if (var3 != 0) {
         throw new q0(var3);
      }

      if (var5) {
         this.x8 = true;
      }

      return var5;
   }

   private int n5(com.aspose.slides.internal.s0c.n5 var1, byte[] var2, int var3, int var4, int var5, int[] var6) {
      return var1.n5(var2, var3, var4, var5, var6);
   }

   public int n5(byte[] var1, int var2, int var3, int var4) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 >= 0 && var2 <= com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6()) {
         if (var3 >= 0 && var2 + var3 <= com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6()) {
            return this.k5(var1, var2, var3, var4);
         } else {
            throw new ArgumentOutOfRangeException("size");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset");
      }
   }

   private int k5(byte[] var1, int var2, int var3, int var4) {
      int var5 = 0;
      int[] var6 = new int[]{0};
      int var7 = this.n5(this.k5, var1, var2, var3, var4, var6);
      var5 = var6[0];
      if (var5 != 0) {
         if (var5 != 10035 && var5 != 10036) {
            this.x8 = false;
         }

         throw new q0(var5);
      } else {
         this.x8 = true;
         return var7;
      }
   }

   private int n5(com.aspose.slides.internal.s0c.n5 var1, byte[] var2, int var3, int var4, int var5, w2[] var6, int[] var7) {
      return var1.n5(var2, var3, var4, var5, var6, var7);
   }

   private int n5(byte[] var1, int var2, int var3, int var4, com.aspose.slides.internal.g8v.q0[] var5) {
      this.s7();
      w2 var6 = var5[0].l6();
      int var7 = 0;
      w2[] var8 = new w2[]{var6};
      int[] var9 = new int[]{0};
      int var10 = this.n5(this.k5, var1, var2, var3, var4, var8, var9);
      var6 = var8[0];
      var7 = var9[0];
      if (var7 != 0) {
         if (var7 != 10035 && var7 != 10036) {
            this.x8 = false;
         }

         throw new q0(var7);
      } else {
         this.x8 = true;
         if (var6 != null) {
            var5[0] = var5[0].n5(var6);
         }

         return var10;
      }
   }

   private int l6(com.aspose.slides.internal.s0c.n5 var1, byte[] var2, int var3, int var4, int var5, int[] var6) {
      return var1.l6(var2, var3, var4, var5, var6);
   }

   public int l6(byte[] var1, int var2, int var3, int var4) {
      this.s7();
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 >= 0 && var2 <= com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6()) {
         if (var3 >= 0 && var2 + var3 <= com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6()) {
            return this.u3(var1, var2, var3, var4);
         } else {
            throw new ArgumentOutOfRangeException("size");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset");
      }
   }

   private int u3(byte[] var1, int var2, int var3, int var4) {
      if (var3 == 0) {
         return 0;
      }

      int var5 = 0;
      int[] var6 = new int[]{0};
      int var7 = this.l6(this.k5, var1, var2, var3, var4, var6);
      var5 = var6[0];
      if (var5 != 0) {
         if (var5 != 10035 && var5 != 10036) {
            this.x8 = false;
         }

         throw new q0(var5);
      } else {
         this.x8 = true;
         return var7;
      }
   }

   private int n5(com.aspose.slides.internal.s0c.n5 var1, byte[] var2, int var3, int var4, int var5, com.aspose.slides.internal.g8v.q0 var6, int[] var7) {
      return var1.n5(var2, var3, var4, var5, var6, var7);
   }

   private int n5(byte[] var1, int var2, int var3, int var4, com.aspose.slides.internal.g8v.q0 var5) {
      int var6 = 0;
      int[] var7 = new int[]{0};
      int var8 = this.n5(this.k5, var1, var2, var3, var4, var5, var7);
      var6 = var7[0];
      if (var6 != 0) {
         if (var6 != 10035 && var6 != 10036) {
            this.x8 = false;
         }

         throw new q0(var6);
      } else {
         this.x8 = true;
         return var8;
      }
   }

   private void n5(com.aspose.slides.internal.s0c.n5 var1, int var2, int var3, Object var4, byte[] var5, int var6, int[] var7) {
      var1.n5(var2, var3, var4, var5, var6, var7);
   }

   public void n5(int var1, int var2, int var3) {
      this.s7();
      int var4 = 0;
      int[] var5 = new int[]{0};
      this.n5(this.k5, var1, var2, null, null, var3, var5);
      var4 = var5[0];
      if (var4 != 0) {
         throw new q0(var4);
      }
   }

   @Override
   public int hashCode() {
      return this.k5 == null ? -1 : this.k5.hashCode();
   }

   private void s7() {
      if (this.l6 && this.n3) {
         throw new ObjectDisposedException(j8.n5(this).q0());
      }
   }

   protected void l6(boolean var1) {
      if (!this.l6) {
         this.l6 = true;
         this.x8 = false;
         if (this.k5 != null) {
            int var2 = 0;
            this.n3 = true;
            com.aspose.slides.internal.s0c.n5 var3 = this.k5;
            this.k5 = null;
            int[] var4 = new int[]{0};
            this.n5(var3, var4);
            var2 = var4[0];
            if (var2 != 0) {
               throw new q0(var2);
            }
         }
      }
   }

   public void k5(boolean var1) {
      this.n5(6, 1, var1 ? 1 : 0);
   }

   public int c8() {
      throw new NotImplementedException();
   }

   public void n5(int var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      this.k5.n5(65535, 4102, null, null, var1, var3);
      var2 = var3[0];
      if (var2 != 0) {
         throw new q0(var2);
      }
   }

   public int t2() {
      throw new NotImplementedException();
   }

   public void l6(int var1) {
   }

   @Override
   public void dispose() {
      this.l6(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   @Override
   protected void finalize() throws Throwable {
      this.l6(false);
      super.finalize();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.s0c.n5 n5(h0 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static Queue l6(h0 var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static Queue k5(h0 var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static int n5(h0 var0, byte[] var1, int var2, int var3, int var4) {
      return var0.k5(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   static int n5(h0 var0, byte[] var1, int var2, int var3, int var4, com.aspose.slides.internal.g8v.q0[] var5) {
      return var0.n5(var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   static int l6(h0 var0, byte[] var1, int var2, int var3, int var4) {
      return var0.u3(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   static int n5(h0 var0, byte[] var1, int var2, int var3, int var4, com.aspose.slides.internal.g8v.q0 var5) {
      return var0.n5(var1, var2, var3, var4, var5);
   }
}
