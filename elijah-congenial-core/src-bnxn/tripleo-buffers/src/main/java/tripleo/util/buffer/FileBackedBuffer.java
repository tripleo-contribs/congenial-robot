package tripleo.util.buffer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBackedBuffer implements TextBuffer {
	TextBuffer backing = new DefaultBuffer("");
	private Buffer _parent;
	private Buffer _next;
	private       Buffer _previous;
	private final String fn;

	public FileBackedBuffer(String fn) {
		this.fn = fn;
	}

	/*
	@Override
	public void finalize() {
	   this.dispose();
	}
	*/

	public void dispose() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(this.fn);
			fileOutputStream.write(this.backing.toString().getBytes());
			fileOutputStream.close();
		} catch (FileNotFoundException var2) {
			var2.printStackTrace();
		} catch (IOException var3) {
			var3.printStackTrace();
		}

	}

	@Override
	public void append(String string) {
		this.backing.append(string);
	}

	@Override
	public void append_s(String string) {
		this.backing.append_s(string);
	}

	@Override
	public void append_cb(String string) {
		this.backing.append_cb(string);
	}

	@Override
	public void decr_i() {
		this.backing.decr_i();
	}

	@Override
	public void incr_i() {
		this.backing.incr_i();
	}

	@Override
	public void append_nl_i(String string) {
		this.backing.append_nl_i(string);
	}

	@Override
	public void append_nl(String string) {
		this.backing.append_nl(string);
	}

	@Override
	public void append_ln(String string) {
		this.backing.append_ln(string);
	}

	@Override
	public String getText() {
		return this.backing.getText();
	}

	@Override
	public Buffer next() {
		return this._next;
	}

	@Override
	public Buffer previous() {
		return this._previous;
	}

	@Override
	public Buffer parent() {
		return this._parent;
	}
}
