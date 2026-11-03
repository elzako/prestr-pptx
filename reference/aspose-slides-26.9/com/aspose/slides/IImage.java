package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;
import java.awt.Dimension;
import java.io.OutputStream;

/**
 * Disposable raster or vector image used by the modern imaging API.
 * Call dispose() in a finally block after the last save or presentation insertion.
 * Dimensions are pixels. Caller-provided output streams remain caller-owned.
 * @see <a href="https://docs.aspose.com/slides/java/modern-api/">Modern imaging API</a>
 */
public interface IImage extends IDisposable {
   /** Saves using the image's default encoder. */
   void save(String filename);
   /** Saves to a file using an ImageFormat constant. */
   void save(String filename, int format);
   /** Writes to the caller's stream using an ImageFormat constant. */
   void save(OutputStream stream, int format);
   /** Saves with JPEG quality from 0 through 100; other formats ignore quality. */
   void save(String filename, int format, int quality);
   /** Writes with JPEG quality from 0 through 100; other formats ignore quality. */
   void save(OutputStream stream, int format, int quality);
   /** Returns the image dimensions in pixels. */
   Dimension getSize();
   /** Returns the width in pixels. */
   int getWidth();
   /** Returns the height in pixels. */
   int getHeight();
}
