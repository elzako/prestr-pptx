package com.aspose.slides.internal.s0c;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.g8v.e5;
import com.aspose.slides.internal.g8v.q0;
import com.aspose.slides.internal.g8v.w2;
import com.aspose.slides.internal.p6w.h0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.AlreadyConnectedException;
import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.ConnectionPendingException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Selector;
import java.nio.channels.UnresolvedAddressException;
import java.nio.channels.UnsupportedAddressTypeException;

class u3 implements n5 {
   private DatagramSocket n5;
   private DatagramChannel l6;
   private InetSocketAddress k5;

   public u3() {
      try {
         this.l6 = DatagramChannel.open();
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }

      this.n5 = this.l6.socket();
   }

   @Override
   public int hashCode() {
      return this.n5 == null ? -1 : this.n5.toString().hashCode();
   }

   @Override
   public void n5(boolean var1, int[] var2) {
      var2[0] = 0;
      if (this.n5 == null) {
         var2[0] = 10022;
      } else {
         try {
            this.l6.configureBlocking(var1);
         } catch (Exception var4) {
            var2[0] = 10022;
         }
      }
   }

   @Override
   public void n5(q0 var1, int[] var2) {
      var2[0] = 0;
      e5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, e5.class);
      if (var3 == null) {
         var2[0] = 10044;
      } else if (this.n5 != null && !this.n5.isBound() && !this.n5.isConnected()) {
         try {
            Socket var4 = new Socket();
            var4.bind(new InetSocketAddress(InetAddress.getByName(var3.u3().toString()), var3.a6()));
            this.k5 = (InetSocketAddress)var4.getLocalSocketAddress();
            var4.close();
            this.n5.bind(this.k5);
         } catch (Exception var5) {
            var5.printStackTrace();
            var2[0] = 10048;
         }
      } else {
         var2[0] = 10022;
      }
   }

   @Override
   public void n5(int[] var1) {
      var1[0] = 0;
      if (this.n5 != null) {
         try {
            this.n5.close();
         } catch (Exception var4) {
            var1[0] = 10022;
         }

         try {
            this.l6.close();
         } catch (Exception var3) {
            var1[0] = 10022;
         }

         this.n5 = null;
         this.l6 = null;
      }
   }

   @Override
   public void l6(q0 var1, int[] var2) {
      var2[0] = 0;
      e5 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, e5.class);
      if (var3 == null) {
         var2[0] = 10044;
      } else if (this.n5 == null) {
         var2[0] = 10022;
      } else if (!this.n5.isConnected() && !this.l6.isConnected()) {
         try {
            this.l6.connect(new InetSocketAddress(InetAddress.getByName(var3.u3().toString()), var3.a6()));
         } catch (AlreadyConnectedException var5) {
            var2[0] = 10056;
         } catch (ConnectionPendingException var6) {
            var2[0] = 10036;
         } catch (UnresolvedAddressException var7) {
            var2[0] = 10039;
         } catch (UnsupportedAddressTypeException var8) {
            var2[0] = 10041;
         } catch (AsynchronousCloseException var9) {
            var2[0] = 10004;
         } catch (Exception var10) {
            var2[0] = 10061;
         }
      } else {
         var2[0] = 10056;
      }
   }

   @Override
   public boolean n5(int var1, int var2, h0 var3, int[] var4) {
      var4[0] = 0;
      Selector var5 = null;

      try {
         var5 = Selector.open();
      } catch (IOException var12) {
         var4[0] = 0;
      }

      this.n5(var5, var1 == 0 ? 0 : 1, var3, var4);
      if (var4[0] != 0) {
         var4[0] = 0;
         com.aspose.slides.internal.s0c.l6.n5(var5);
         return var1 == 2;
      }

      boolean var6 = false;
      long var7 = com.aspose.slides.internal.v6g.k5.u9(1, 9);
      if (var2 < 0) {
         var7 = com.aspose.slides.internal.v6g.k5.u9(0, 9);
      } else if (var2 > 999) {
         var7 = com.aspose.slides.internal.v6g.k5.u9(var2 / 1000, 9);
      }

      int var9 = 0;

      try {
         var9 = var5.select(var7);
      } catch (Exception var11) {
         var4[0] = 10022;
      }

      com.aspose.slides.internal.s0c.l6.n5(var5);
      return var6;
   }

   public void n5(Selector var1, int var2, h0 var3, int[] var4) {
      var4[0] = 0;

      try {
         byte var5 = 1;
         if (var2 > 0) {
            var5 = 4;
         }

         if (this.l6.isBlocking()) {
            this.l6.configureBlocking(false);
         }

         this.l6.register(var1, var5, var3);
      } catch (Exception var6) {
         var4[0] = 10022;
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, int var4, int[] var5) {
      var5[0] = 0;
      int var6 = 0;
      if (this.n5 == null) {
         var5[0] = 10057;
         return var6;
      }

      try {
         if (!this.l6.isConnected()) {
            var5[0] = 10057;
            return var6;
         }

         DatagramPacket var7 = new DatagramPacket(var1, var1.length);
         this.l6.socket().receive(var7);
         var6 = var7.getLength();
         if (var6 < 0) {
            var6 = 0;
         }
      } catch (Exception var8) {
         var5[0] = 10054;
         var6 = 0;
      }

      if (var6 == 0 && !this.l6.isBlocking()) {
         var5[0] = 10035;
      }

      return var6;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, int var4, w2[] var5, int[] var6) {
      return this.n5(var1, var2, var3, var4, var6);
   }

   @Override
   public int l6(byte[] var1, int var2, int var3, int var4, int[] var5) {
      var5[0] = 0;
      int var6 = 0;
      if (this.n5 == null) {
         var5[0] = 10057;
         return var6;
      }

      try {
         if (!this.l6.isConnected()) {
            var5[0] = 10057;
            return var6;
         }

         ByteBuffer var7 = ByteBuffer.wrap(com.aspose.slides.internal.m9a.n5.n5(var1), var2, var3);
         var6 = this.l6.write(var7);
         if (var6 < 0) {
            var6 = 0;
         }
      } catch (Exception var8) {
         var5[0] = 10054;
         var6 = 0;
      }

      if (var6 == 0 && !this.l6.isBlocking()) {
         var5[0] = 10035;
      }

      return var6;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, int var4, q0 var5, int[] var6) {
      if (!this.l6.isConnected()) {
         this.l6(var5, var6);
      }

      return this.l6(var1, var2, var3, var4, var6);
   }

   @Override
   public void n5(int var1, int var2, Object var3, byte[] var4, int var5, int[] var6) {
      var6[0] = 0;
      if (var4 != null) {
         var6[0] = -1;
         throw new NotImplementedException();
      }

      if (this.n5 == null) {
         var6[0] = 10022;
      } else {
         switch (var1) {
            case 0:
               if (var2 != 1) {
                  var6[0] = 10042;
                  return;
               }
               break;
            case 6:
               if (var2 != 1) {
                  var6[0] = 10022;
                  return;
               }
               break;
            case 17:
               if (var2 != 1) {
                  var6[0] = 10022;
               }

               return;
            case 41:
               var6[0] = 10042;
               return;
         }

         try {
            boolean var7 = false;
            int var8 = 0;
            switch (var2) {
               case 4:
                  if (var3 != null) {
                     var7 = com.aspose.slides.internal.v6g.k5.u3(var3, int.class) != 0;
                  } else {
                     var7 = var5 != 0;
                  }

                  this.n5.setReuseAddress(var7);
                  break;
               case 4097:
                  var8 = var5;
                  if (var3 != null) {
                     var8 = com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
                  }

                  this.n5.setSendBufferSize(var8);
                  break;
               case 4098:
                  var8 = var5;
                  if (var3 != null) {
                     var8 = com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
                  }

                  this.n5.setReceiveBufferSize(var8);
                  break;
               case 4102:
                  var8 = var5;
                  if (var3 != null) {
                     var8 = com.aspose.slides.internal.v6g.k5.u3(var3, int.class);
                  }

                  this.n5.setSoTimeout(var8);
                  break;
               default:
                  var6[0] = 10022;
            }
         } catch (Exception var9) {
            var6[0] = 10022;
            var3 = null;
         }
      }
   }
}
