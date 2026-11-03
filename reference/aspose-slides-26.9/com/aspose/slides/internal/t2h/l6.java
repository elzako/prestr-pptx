package com.aspose.slides.internal.t2h;

import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.r5w.h0;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.SampleModel;
import java.awt.image.TileObserver;
import java.awt.image.WritableRaster;
import java.util.Vector;

public abstract class l6 extends BufferedImage {
   protected final int n5;
   protected final int l6;
   protected BufferedImage k5;
   protected int u3;

   public l6(int var1, int var2, int var3) {
      super(1, 1, 2);
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var3;
   }

   protected abstract BufferedImage n5();

   protected final synchronized BufferedImage l6() {
      if (this.k5 == null) {
         this.k5 = this.n5();
         com.aspose.slides.internal.o9b.l6 var1 = com.aspose.slides.internal.o9b.l6.n5(this.k5);
         int var2 = var1.s7();
         if (var2 != this.u3) {
            var1 = h0.n5(var1, this.u3);
            this.k5 = com.aspose.slides.internal.o9b.l6.n5(var1);
         }
      }

      return this.k5;
   }

   public abstract l6 n5(int var1);

   @Override
   public int getType() {
      return t4.a6(this.u3);
   }

   @Override
   public int getWidth() {
      return this.n5;
   }

   @Override
   public int getHeight() {
      return this.l6;
   }

   @Override
   public int getWidth(ImageObserver observer) {
      return this.n5;
   }

   @Override
   public int getHeight(ImageObserver observer) {
      return this.l6;
   }

   @Override
   public Object getProperty(String name, ImageObserver observer) {
      return super.getProperty(name, observer);
   }

   @Override
   public Object getProperty(String name) {
      return super.getProperty(name);
   }

   @Override
   public String[] getPropertyNames() {
      return super.getPropertyNames();
   }

   @Override
   public ColorModel getColorModel() {
      return this.l6().getColorModel();
   }

   @Override
   public WritableRaster getRaster() {
      return this.l6().getRaster();
   }

   @Override
   public WritableRaster getAlphaRaster() {
      return this.l6().getAlphaRaster();
   }

   @Override
   public int getRGB(int x, int y) {
      return this.l6().getRGB(x, y);
   }

   @Override
   public int[] getRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
      return this.l6().getRGB(startX, startY, w, h, rgbArray, offset, scansize);
   }

   @Override
   public synchronized void setRGB(int x, int y, int rgb) {
      this.l6().setRGB(x, y, rgb);
   }

   @Override
   public void setRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
      this.l6().setRGB(startX, startY, w, h, rgbArray, offset, scansize);
   }

   @Override
   public ImageProducer getSource() {
      return this.l6().getSource();
   }

   @Override
   public Graphics getGraphics() {
      return this.l6().getGraphics();
   }

   @Override
   public Graphics2D createGraphics() {
      return this.l6().createGraphics();
   }

   @Override
   public BufferedImage getSubimage(int x, int y, int w, int h) {
      return this.l6().getSubimage(x, y, w, h);
   }

   @Override
   public boolean isAlphaPremultiplied() {
      return this.l6().isAlphaPremultiplied();
   }

   @Override
   public void coerceData(boolean isAlphaPremultiplied) {
      this.l6().coerceData(isAlphaPremultiplied);
   }

   @Override
   public String toString() {
      return this.l6().toString();
   }

   @Override
   public Vector<RenderedImage> getSources() {
      return this.l6().getSources();
   }

   @Override
   public int getMinX() {
      return this.l6().getMinX();
   }

   @Override
   public int getMinY() {
      return this.l6().getMinY();
   }

   @Override
   public SampleModel getSampleModel() {
      return this.l6().getSampleModel();
   }

   @Override
   public int getNumXTiles() {
      return this.l6().getNumXTiles();
   }

   @Override
   public int getNumYTiles() {
      return this.l6().getNumYTiles();
   }

   @Override
   public int getMinTileX() {
      return this.l6().getMinTileX();
   }

   @Override
   public int getMinTileY() {
      return this.l6().getMinTileY();
   }

   @Override
   public int getTileWidth() {
      return this.l6().getTileWidth();
   }

   @Override
   public int getTileHeight() {
      return this.l6().getTileHeight();
   }

   @Override
   public int getTileGridXOffset() {
      return this.l6().getTileGridXOffset();
   }

   @Override
   public int getTileGridYOffset() {
      return this.l6().getTileGridYOffset();
   }

   @Override
   public Raster getTile(int tileX, int tileY) {
      return this.l6().getTile(tileX, tileY);
   }

   @Override
   public Raster getData() {
      return this.l6().getData();
   }

   @Override
   public Raster getData(Rectangle rect) {
      return this.l6().getData(rect);
   }

   @Override
   public WritableRaster copyData(WritableRaster outRaster) {
      return this.l6().copyData(outRaster);
   }

   @Override
   public void setData(Raster r) {
      this.l6().setData(r);
   }

   @Override
   public void addTileObserver(TileObserver to) {
      this.l6().addTileObserver(to);
   }

   @Override
   public void removeTileObserver(TileObserver to) {
      this.l6().removeTileObserver(to);
   }

   @Override
   public boolean isTileWritable(int tileX, int tileY) {
      return this.l6().isTileWritable(tileX, tileY);
   }

   @Override
   public Point[] getWritableTileIndices() {
      return this.l6().getWritableTileIndices();
   }

   @Override
   public boolean hasTileWriters() {
      return this.l6().hasTileWriters();
   }

   @Override
   public WritableRaster getWritableTile(int tileX, int tileY) {
      return this.l6().getWritableTile(tileX, tileY);
   }

   @Override
   public void releaseWritableTile(int tileX, int tileY) {
      this.l6().releaseWritableTile(tileX, tileY);
   }

   @Override
   public int getTransparency() {
      return this.l6().getTransparency();
   }

   @Override
   public Image getScaledInstance(int width, int height, int hints) {
      return this.l6().getScaledInstance(width, height, hints);
   }

   @Override
   public void flush() {
      this.l6().flush();
   }

   @Override
   public ImageCapabilities getCapabilities(GraphicsConfiguration gc) {
      return this.l6().getCapabilities(gc);
   }

   @Override
   public void setAccelerationPriority(float priority) {
      this.l6().setAccelerationPriority(priority);
   }

   @Override
   public float getAccelerationPriority() {
      return this.l6().getAccelerationPriority();
   }
}
