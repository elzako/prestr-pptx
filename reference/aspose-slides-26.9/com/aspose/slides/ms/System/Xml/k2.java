package com.aspose.slides.ms.System.Xml;

public class k2 extends com.aspose.slides.internal.z0k.t4 {
   protected com.aspose.slides.internal.z0k.t4 n5;
   private w9 l6;
   private String k5;

   public k2(com.aspose.slides.internal.z0k.t4 var1, w9 var2, String var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   protected void finalize() throws Throwable {
      try {
         if (this.l6 != null) {
            this.l6.n5(this.k5);
         }

         this.n5 = null;
      } finally {
         super.finalize();
      }
   }

   @Override
   protected void dispose(boolean disposing) {
      try {
         if (disposing && this.n5 != null) {
            if (this.l6 != null) {
               this.l6.n5(this.k5);
            }

            this.n5.close();
         }

         this.n5 = null;
         com.aspose.slides.ms.System.e5.n5(this);
      } finally {
         super.dispose(disposing);
      }
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginRead(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      return this.n5.beginRead(buffer, offset, count, callback, state);
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginWrite(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      return this.n5.beginWrite(buffer, offset, count, callback, state);
   }

   @Override
   public int endRead(com.aspose.slides.ms.System.z7 asyncResult) {
      return this.n5.endRead(asyncResult);
   }

   @Override
   public void endWrite(com.aspose.slides.ms.System.z7 asyncResult) {
      this.n5.endWrite(asyncResult);
   }

   @Override
   public void flush() {
      this.n5.flush();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      return this.n5.read(buffer, offset, count);
   }

   @Override
   public int readByte() {
      return this.n5.readByte();
   }

   @Override
   public long seek(long offset, int origin) {
      return this.n5.seek(offset, origin);
   }

   @Override
   public void setLength(long value) {
      this.n5.setLength(value);
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      this.n5.write(buffer, offset, count);
   }

   @Override
   public void writeByte(byte value) {
      this.n5.writeByte(value);
   }

   @Override
   public boolean canRead() {
      return this.n5.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.n5.canSeek();
   }

   @Override
   public boolean canWrite() {
      return this.n5.canWrite();
   }

   @Override
   public long getLength() {
      return this.n5.getLength();
   }

   @Override
   public long getPosition() {
      return this.n5.getPosition();
   }

   @Override
   public void setPosition(long value) {
      this.n5.setPosition(value);
   }
}
