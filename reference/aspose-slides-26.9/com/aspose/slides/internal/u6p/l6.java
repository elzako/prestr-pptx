package com.aspose.slides.internal.u6p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.h3d.m3;
import com.aspose.slides.internal.h3d.n3;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.z0k.t4;

public final class l6 {
   private int n5 = 0;
   private m3 l6;
   private s3 k5 = new s3();
   private n3 u3;
   private int a6 = 1;
   private int u9 = 3;
   private static n3 h0;

   public l6() {
      this.u3 = n5();
      this.k5 = new s3(255);
   }

   static n3 n5() {
      return h0;
   }

   public int l6() {
      return this.n5;
   }

   public m3 k5() {
      return this.l6;
   }

   public s3 u3() {
      return this.k5;
   }

   public n3 a6() {
      return this.u3;
   }

   public int u9() {
      return this.a6;
   }

   public Object n5(t4 var1) {
      return this.l6(var1, null);
   }

   private Object l6(t4 var1, Object var2) {
      if (var1 == null) {
         throw new ArgumentNullException("serializationStream");
      } else if (var1.canSeek() && var1.getLength() == 0L) {
         throw new SerializationException("serializationStream supports seeking, but its length is 0");
      } else {
         com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1);
         boolean var4 = false;
         boolean[] var5 = new boolean[]{false};
         this.n5(var3, var5);
         var4 = var5[0];
         byte var6 = (byte)var3.y4();
         if (var6 == 21) {
            throw new NotImplementedException();
         } else if (var6 == 22) {
            throw new NotImplementedException();
         } else {
            a6 var7 = new a6(this);
            Object var8 = null;
            Object var9 = null;
            Object[] var10 = new Object[]{var8};
            Object[][] var11 = new Object[][]{(Object[])var9};
            var7.n5(var6, var3, var4, var10, var11);
            var8 = var10[0];
            var9 = var11[0];
            if (var2 != null) {
               throw new NotImplementedException();
            } else {
               return var8;
            }
         }
      }
   }

   public void n5(t4 var1, Object var2) {
      this.n5(var1, var2, null);
   }

   public void n5(t4 var1, Object var2, Object[] var3) {
      if (var1 == null) {
         throw new ArgumentNullException("serializationStream");
      }

      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var1);
      this.n5(var4, var3 != null);
      h0 var5 = new h0(this);
      var5.n5(var4, var2, var3);
      var4.k5();
   }

   private void n5(com.aspose.slides.internal.z0k.l6 var1, boolean var2) {
      var1.n5((byte)0);
      var1.l6(1);
      if (var2) {
         var1.l6(2);
      } else {
         var1.l6(-1);
      }

      var1.l6(1);
      var1.l6(0);
   }

   private void n5(com.aspose.slides.internal.z0k.n5 var1, boolean[] var2) {
      var1.z1();
      var1.m3();
      int var3 = var1.m3();
      var2[0] = var3 == 2;
      var1.m3();
      var1.m3();
   }
}
