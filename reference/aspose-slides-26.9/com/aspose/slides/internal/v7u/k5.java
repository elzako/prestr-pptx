package com.aspose.slides.internal.v7u;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.internal.q9r.a0;
import com.aspose.slides.internal.q9r.k7;
import com.aspose.slides.internal.q9r.q0;
import com.aspose.slides.internal.q9r.u9;
import com.aspose.slides.internal.u1n.u3;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.x9;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import java.util.HashSet;

public final class k5 extends n5 {
   private com.aspose.slides.internal.q9r.l6 l6 = new com.aspose.slides.internal.q9r.l6(new k7[0]);
   private HashSet<Integer> k5 = new HashSet<>();

   public k5() {
      this.n5 = new com.aspose.slides.internal.u1n.k5(com.aspose.slides.internal.u1n.n5.n5());
      this.n5.n5(com.aspose.slides.internal.u1n.n5.n5(this.n5.n5(), this), this.l6);
   }

   public void n5(String var1) throws FileNotFoundException {
      if (var1 == null) {
         throw new ArgumentNullException("filename");
      }

      if (this.n5 == null) {
         throw new ArgumentException("Parameter is not valid");
      }

      var1 = z1.k5(var1);
      int var2 = this.l6(var1);
      if (!this.k5.contains(var2)) {
         q0 var3 = new q0(var1);

         try {
            k7[] var4 = new u9().l6(var3);

            for (k7 var8 : var4) {
               this.n5(var8);
            }
         } catch (Exception var9) {
            throw new FileNotFoundException(d1.n5("The specified font '{0}' is not supported or the font file cannot be found", new Object[]{var1}), var9);
         }

         this.k5.add(var2);
      }
   }

   public void n5(x9 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentException("Pointer can't be null");
      }

      if (this.n5 == null) {
         throw new ArgumentException("Parameter is not valid");
      }

      try {
         byte[] var3 = (byte[])var1.k5().n5();
         if (var3.length != var2) {
            var3 = Arrays.copyOfRange(var3, 0, var2);
         }

         int var4 = this.n5(var3);
         if (!this.k5.contains(var4)) {
            a0 var5 = new a0(var3);
            k7[] var6 = new u9().l6(var5);

            for (k7 var10 : var6) {
               this.n5(var10);
            }

            this.k5.add(var4);
         }
      } catch (Exception var11) {
         throw new FileNotFoundException("File not found", var11);
      }
   }

   public static boolean n5(k5 var0, k5 var1) {
      return com.aspose.slides.internal.q9r.l6.n5(var0.l6, var1.l6);
   }

   private void n5(k7 var1) {
      try {
         t4 var2 = null;

         try {
            var2 = var1.l6();
            this.n5(u3.n5(var2.toInputStream()), var1);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } catch (ArgumentException var8) {
         throw var8;
      } catch (Exception var9) {
         String var3 = var1 instanceof q0
            ? d1.n5("The specified font '{0}' is not supported or the font file cannot be found", new Object[]{((q0)var1).n5()})
            : "File not found";
         throw new FileNotFoundException(var3, var9);
      }
   }

   private void n5(Font var1, k7 var2) {
      if (this.n5 == null) {
         throw new ArgumentException("Parameter is not valid");
      }

      GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(var1);
      synchronized (this.n5) {
         this.n5.n5(var1);
         this.l6.n5(var2);
         this.n5.n5(com.aspose.slides.internal.u1n.n5.n5(this.n5.n5(), this), this.l6);
      }
   }

   private int l6(String var1) {
      return var1.hashCode();
   }

   private int n5(byte[] var1) {
      return Arrays.hashCode(var1);
   }

   @Override
   protected void n5(boolean var1) {
      if (this.n5 != null) {
         this.n5.k5();
      }

      this.n5 = null;
      this.k5 = null;
      super.n5(var1);
   }
}
