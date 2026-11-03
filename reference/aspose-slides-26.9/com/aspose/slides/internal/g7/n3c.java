package com.aspose.slides.internal.g7;

public class n3c {
   private int n5;
   private int l6;
   private v7u k5;

   public n3c(v7u var1) {
      this.k5 = var1;
   }

   public n3c(int var1, int var2, v7u var3) {
      this(var3);
      this.n5 = var1;
      this.l6 = var2;
   }

   public final v7u k5() {
      return this.k5;
   }

   public final int u3() {
      return this.n5;
   }

   public final int a6() {
      return this.l6;
   }

   public void n5(f3c var1) {
   }

   public void n5(byte[][] var1, long[] var2) {
      var1[0] = new byte[0];
      var2[0] = 0L;
   }

   public final boolean u9() {
      return (this.n5 & 65535) != 3 || (this.l6 & 65535) != 4;
   }

   public final byte[] l6(int var1) {
      if ((this.n5 & 65535) == 3 && (this.l6 & 65535) == 4) {
         com.aspose.slides.internal.l7h.j5 var2 = z8.n5("big5");
         byte[] var3 = com.aspose.slides.internal.l7h.j5.z1().l6(new char[]{(char)(var1 & 65535)});
         return com.aspose.slides.internal.l7h.j5.n5(com.aspose.slides.internal.l7h.j5.z1(), var2, var3);
      } else {
         return com.aspose.slides.ms.System.x8.n5((short)var1);
      }
   }

   public void n5(int var1, int var2) {
   }

   public int[] n5() {
      return new int[0];
   }

   public int n5(int var1) {
      return 0;
   }
}
