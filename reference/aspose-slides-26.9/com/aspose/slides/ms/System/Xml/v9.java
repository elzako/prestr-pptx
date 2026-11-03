package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

public abstract class v9 extends l1 {
   protected r9 p8;
   protected a3 f2;

   @Override
   public void t2() {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void l6(boolean var1) {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void n5(String var1, String var2, String var3, String var4) {
   }

   @Override
   public void s7() {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void x8() {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) {
      if (this.p8 == null) {
         this.p8 = new r9(this);
      }

      this.p8.n5(var1, var2, var3);
   }

   public String n3(String var1) {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public int n3() {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void a6(String var1) {
      this.l6(var1);
   }

   @Override
   public void n5(char var1) {
      this.l6(com.aspose.slides.ms.System.d1.n5(new char[]{var1}));
   }

   @Override
   public void n5(char var1, char var2) {
      this.l6(com.aspose.slides.ms.System.d1.n5(new char[]{var1, var2}));
   }

   @Override
   public void h0(String var1) {
      this.l6(var1);
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      this.l6(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
   }

   @Override
   public void a_(char[] var1, int var2, int var3) {
      this.l6(com.aspose.slides.ms.System.d1.n5(var1, var2, var3));
   }

   @Override
   public void c8(String var1) {
      this.l6(var1);
   }

   @Override
   public void t2(String var1) {
      this.l6(var1);
   }

   @Override
   public void n5(c7 var1, boolean var2) {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   @Override
   public void l6(c7 var1, boolean var2) {
      throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
   }

   public void n5(a3 var1) {
      this.f2 = var1;
   }

   public void n5(int var1) {
   }

   public void n5(String var1) {
   }

   public abstract void n5();

   public void k5(int var1) {
   }

   public abstract void l6(String var1, String var2, String var3);

   public void k5(String var1, String var2, String var3) {
      this.l6(var1, var2, var3);
   }

   public abstract void l6(String var1, String var2);

   public boolean aa_() {
      return false;
   }

   public void u3(String var1) {
      throw new NotSupportedException();
   }

   public void u3() {
      throw new NotSupportedException();
   }

   public void c8() {
      this.p8.n5();
   }

   public void u3(int var1) {
      this.a6();
   }
}
