package com.aspose.slides.internal.z0k;

class c4 extends t4 {
   private t4 n5;
   private final Object l6;

   c4(t4 var1) {
      this.n5 = var1;
      this.l6 = new Object();
   }

   @Override
   public boolean canRead() {
      synchronized (this.l6) {
         return this.n5.canRead();
      }
   }

   @Override
   public boolean canSeek() {
      synchronized (this.l6) {
         return this.n5.canSeek();
      }
   }

   @Override
   public boolean canWrite() {
      synchronized (this.l6) {
         return this.n5.canWrite();
      }
   }

   @Override
   public long getLength() {
      synchronized (this.l6) {
         return this.n5.getLength();
      }
   }

   @Override
   public long getPosition() {
      synchronized (this.l6) {
         return this.n5.getPosition();
      }
   }

   @Override
   public void setPosition(long value) {
      synchronized (this.l6) {
         this.n5.setPosition(value);
      }
   }

   @Override
   public void flush() {
      synchronized (this.l6) {
         this.n5.flush();
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      synchronized (this.l6) {
         return this.n5.read(buffer, offset, count);
      }
   }

   @Override
   public int readByte() {
      synchronized (this.l6) {
         return this.n5.readByte();
      }
   }

   @Override
   public long seek(long offset, int origin) {
      synchronized (this.l6) {
         return this.n5.seek(offset, origin);
      }
   }

   @Override
   public void setLength(long value) {
      synchronized (this.l6) {
         this.n5.setLength(value);
      }
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      synchronized (this.l6) {
         this.n5.write(buffer, offset, count);
      }
   }

   @Override
   public void writeByte(byte value) {
      synchronized (this.l6) {
         this.n5.writeByte(value);
      }
   }
}
