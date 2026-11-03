package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;

@com.aspose.slides.ms.System.j3
public class d2 extends u8 implements IDisposable {
   private com.aspose.slides.ms.System.r8 n5;
   private y5 l6;
   private c8 k5;
   private String u3;
   private com.aspose.slides.ms.System.b5 a6;
   private int u9;
   private String h0;
   private long c8;
   private String t2;
   private t2 s7;
   private boolean x8;
   private com.aspose.slides.internal.z0k.t4 n3;

   d2(com.aspose.slides.ms.System.r8 var1, String var2, i9 var3, t2 var4) {
      this.n5 = var1;
      this.u3 = var2;
      this.l6 = var3.k5;
      this.a6 = var3.u3;
      this.u9 = var3.n5;
      this.h0 = var3.l6;
      this.n3 = var3.u9;
      this.c8 = com.aspose.slides.internal.v6g.k5.u9(-1, 9);

      try {
         String var5 = this.l6.get_Item("Content-Length");
         long[] var6 = new long[]{this.c8};
         boolean var7 = com.aspose.slides.ms.System.d1.n5(var5) || !com.aspose.slides.ms.System.p3.n5(var5, var6);
         this.c8 = var6[0];
         if (var7) {
            this.c8 = com.aspose.slides.internal.v6g.k5.u9(-1, 9);
         }
      } catch (RuntimeException var8) {
         this.c8 = com.aspose.slides.internal.v6g.k5.u9(-1, 9);
      }

      if (var4 != null) {
         this.s7 = var4;
         this.s7();
      }

      String var9 = this.l6.get_Item("Content-Encoding");
      if ("gzip".equals(var9) && (var3.n5().l6() & 1) != 0) {
         this.n3 = new com.aspose.slides.internal.f3h.k5(this.n3, 1);
      } else if ("deflate".equals(var9) && (var3.n5().l6() & 2) != 0) {
         this.n3 = new com.aspose.slides.internal.f3h.l6(this.n3, 1);
      }
   }

   @Override
   public y5 n5() {
      return this.l6;
   }

   @Override
   public com.aspose.slides.ms.System.r8 l6() {
      this.t2();
      return this.n5;
   }

   public int k5() {
      return this.u9;
   }

   public String u3() {
      this.t2();
      return this.h0;
   }

   void a6() {
      p6 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n3, p6.class);
      if (var1 != null) {
         try {
            var1.c8();
         } catch (RuntimeException var3) {
         }
      }
   }

   @Override
   public com.aspose.slides.internal.z0k.t4 u9() {
      this.t2();
      if (this.n3 == null) {
         return com.aspose.slides.internal.z0k.t4.Null;
      } else {
         return com.aspose.slides.ms.System.d1.u3(this.u3, "HEAD", (short)5) ? com.aspose.slides.internal.z0k.t4.Null : this.n3;
      }
   }

   @Override
   public void getObjectData(com.aspose.slides.internal.h3d.c4 serializationInfo, com.aspose.slides.internal.h3d.s3 streamingContext) {
      serializationInfo.n5("uri", this.n5);
      serializationInfo.n5("contentLength", this.c8);
      serializationInfo.n5("contentType", this.t2);
      serializationInfo.n5("method", this.u3);
      serializationInfo.n5("statusDescription", this.h0);
      serializationInfo.n5("cookieCollection", this.k5);
      serializationInfo.n5("version", this.a6);
      serializationInfo.n5("statusCode", com.aspose.slides.internal.v6g.k5.l6(this.u9));
   }

   @Override
   public void h0() {
      if (this.n3 != null) {
         com.aspose.slides.internal.z0k.t4 var1 = this.n3;
         this.n3 = null;
         if (var1 != null) {
            var1.close();
         }
      }
   }

   @Override
   public void dispose() {
      this.n5(true);
   }

   private void n5(boolean var1) {
      this.x8 = true;
      if (var1) {
         this.h0();
      }
   }

   private void t2() {
      if (this.x8) {
         throw new ObjectDisposedException(com.aspose.slides.ms.System.j8.n5(this).q0());
      }
   }

   private void s7() {
      if (this.l6 != null) {
         try {
            String var1 = this.l6.get("Set-Cookie");
            if (var1 != null && this.n5(var1)) {
               return;
            }
         } catch (RuntimeException var4) {
         }

         try {
            String var5 = this.l6.get("Set-Cookie2");
            if (var5 != null) {
               this.n5(var5);
            }
         } catch (RuntimeException var3) {
         }
      }
   }

   private boolean n5(String var1) {
      if (this.k5 == null) {
         this.k5 = new c8();
      }

      boolean var2 = false;
      x8 var3 = new x8(var1);

      for (h0 var5 : var3.n5()) {
         if ("".equals(var5.u3())) {
            var5.l6(this.n5.a6());
            var5.l6(false);
         }

         if (!var5.a6() || com.aspose.slides.internal.g8v.t2.n5(this.n5, var5.u3())) {
            this.k5.n5(var5);
            if (this.s7 != null) {
               this.s7.n5(this.n5, var5);
               var2 = true;
            }
         }
      }

      return var2;
   }
}
