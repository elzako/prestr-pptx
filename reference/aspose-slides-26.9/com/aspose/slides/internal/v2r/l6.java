package com.aspose.slides.internal.v2r;

import com.aspose.slides.internal.b8u.m3;
import com.aspose.slides.internal.r1x.j4;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class l6 extends t4 implements m3 {
   public static boolean n5 = true;
   private final t4 l6;
   private int k5;
   private boolean u3 = false;
   private final Object a6 = new Object();

   public l6(t4 var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public l6() {
      this(new e2(), 2);
   }

   @Override
   public final Object n5() {
      return j4.n5(this.l6(), this.a6);
   }

   public final t4 l6() {
      return this.l6;
   }

   @Override
   public boolean canRead() {
      this.n5(1, false);
      return this.l6.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.l6.canSeek();
   }

   @Override
   public boolean canWrite() {
      this.n5(2, false);
      return this.l6.canWrite();
   }

   @Override
   public void flush() {
      this.n5(2);
      this.l6.flush();
   }

   @Override
   public long getLength() {
      return this.l6.getLength();
   }

   @Override
   public long getPosition() {
      return this.l6.getPosition();
   }

   @Override
   public void setPosition(long value) {
      this.l6.setPosition(value);
   }

   public static l6 n5(t4 var0) {
      return com.aspose.slides.internal.v6g.k5.l6(var0, l6.class) ? com.aspose.slides.internal.v6g.k5.n5(var0, l6.class) : new l6(var0, 0);
   }

   @Override
   public final InputStream toInputStream() {
      this.n5(2);
      byte[] var1 = this.k5();
      return new ByteArrayInputStream(var1);
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      this.n5(1);
      return this.l6.read(buffer, offset, count);
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      this.n5(2);
      this.l6.write(buffer, offset, count);
   }

   @Override
   public int readByte() {
      this.n5(1);
      return this.l6.readByte();
   }

   @Override
   public void writeByte(byte value) {
      this.n5(2);
      this.l6.writeByte(value);
   }

   @Override
   public long seek(long offset, int origin) {
      return this.l6.seek(offset, origin);
   }

   @Override
   public void setLength(long value) {
      this.l6.setLength(value);
   }

   public final byte[] k5() {
      long var1 = this.l6.getPosition();
      byte[] var3 = new byte[(int)this.l6.getLength()];
      long var4 = 0L;
      byte[] var6 = new byte[4096];

      while (var4 != this.l6.getLength()) {
         this.l6.seek(var4, 0);
         int var7 = this.l6.read(var6, 0, var6.length);
         System.arraycopy(var6, 0, var3, (int)var4, var7);
         var4 += var7;
      }

      this.l6.seek(var1, 0);
      return var3;
   }

   @Override
   protected void dispose(boolean disposing) {
      if (!this.u3) {
         if (disposing && this.l6 != null) {
            this.l6.dispose();
         }

         this.u3 = true;
         super.dispose(disposing);
      }
   }

   private void n5(int var1) {
      this.n5(var1, true);
   }

   private void n5(int var1, boolean var2) {
   }
}
