package com.aspose.slides.internal.q7;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public final class u9 implements x8 {
   private final Object n5 = new Object();
   private String l6;
   private boolean k5 = false;
   private final t2 u3;
   private final s7 a6;
   private com.aspose.slides.internal.z0k.n3 u9;

   public u9() {
      this.u3 = new k5();
      this.a6 = new a6();
   }

   public u9(String var1) {
      this.u3 = new k5();
      this.a6 = new a6(var1);
   }

   public u9(t2 var1, s7 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("errorHandler");
      }

      if (var2 == null) {
         throw new ArgumentNullException("tempFileInfo");
      }

      this.u3 = var1;
      this.a6 = var2;
   }

   @Override
   public final String getNextTempFilePath() {
      String var1 = o0.l6().n5("N");
      synchronized (this.n5) {
         if (!this.k5) {
            throw new InvalidOperationException("Blob temp file service is not initialized successfully");
         } else {
            return z1.l6(this.a6.n5(), var1);
         }
      }
   }

   @Override
   public final boolean getInitialized() {
      synchronized (this.n5) {
         return this.k5;
      }
   }

   public final s7 n5() {
      return this.a6;
   }

   @Override
   public final void init() {
      synchronized (this.n5) {
         if (this.k5) {
            throw new InvalidOperationException("Already initialized");
         }

         this.l6();
         this.l6 = z1.l6(this.a6.n5(), ".pid");

         try {
            com.aspose.slides.internal.z0k.u3.n5(this.a6.n5());
            this.u9 = new com.aspose.slides.internal.z0k.n3(this.l6, 1);
         } catch (RuntimeException var4) {
            this.u3.n5(var4.toString());
            return;
         }

         this.k5 = true;
      }
   }

   @Override
   public final void dispose() {
      synchronized (this.n5) {
         if (!this.k5) {
            if (com.aspose.slides.internal.z0k.u3.k5(this.a6.n5())) {
               com.aspose.slides.internal.z0k.u3.l6(this.a6.n5());
            }
         } else {
            if (this.u9 != null) {
               this.u9.close();
               com.aspose.slides.internal.z0k.u9.l6(this.l6);
            }

            com.aspose.slides.internal.z0k.u3.l6(this.a6.n5());
         }
      }
   }

   private void l6() {
      String[] var1 = com.aspose.slides.internal.z0k.u3.n5(this.a6.l6(), d1.n5("{0}*", new Object[]{this.a6.k5()}));

      for (String var5 : var1) {
         String var6 = z1.l6(var5, ".pid");

         try {
            com.aspose.slides.internal.z0k.n3 var7 = com.aspose.slides.internal.z0k.u9.n5(var6, 3, 3, 0);
            if (var7 != null) {
               var7.dispose();
            }

            try {
               com.aspose.slides.internal.z0k.u3.n5(var5, true);
            } catch (RuntimeException var9) {
               this.u3.n5(var9.toString());
            }
         } catch (RuntimeException var10) {
         }
      }
   }
}
